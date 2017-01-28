package chapter5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String no = scanner.next();
		
		/*
		 * A: 汉诺塔问题
		 * B: 迷宫
		 * C: 棋盘
		 * D: 八皇后问题
		 * 
		 * */
		switch (no){
			case "A":
				int n = scanner.nextInt();
				hanota(n);
				break;
			case "B":
				maze();
				break;
			case "C":
				knight();
				break;
			case "D":
				eightQueen();
				break;
			default:
				break;
		}
	}
	
	/*
	 * Input: n个塔盘
	 * Output: 搬运过程
	 * Attention: A为起始点，C为终点
	 * */
	private static void hanota(int n) {
		fnHanota("A", "C", "B", n);
	}
	
	private static void fnHanota(String start, String dest, String middle, int n) {
		if (n == 1) {
			System.out.printf("%s -> %s ", start, dest);
		} else {
			fnHanota(start, middle, dest, n-1);
			System.out.printf("%n%s -> %s %n", start, dest);
			fnHanota(middle, dest, start, n-1);
		}
	}

	/*
	 * int[][] maze = {
	 *		{2, 2, 2, 2, 2, 2, 2},
	 *		{0, 0, 0, 0, 0, 0, 2},
	 *		{2, 0, 2, 0, 2, 0, 2},
	 *		{2, 0, 0, 2, 0, 2, 2},
	 *		{2, 2, 0, 2, 0, 2, 2},
	 *		{2, 0, 0, 0, 0, 0, 2},
	 *		{2, 2, 2, 2, 2, 0, 2},
	 *	};
	 * Output: 搬运过程
	 * Attention: (1, 0)为起始点，(6, 6)为终点
	 * */
	private static void maze() {
		int[][] maze = {
			{2, 2, 2, 2, 2, 2, 2},
			{0, 0, 0, 0, 0, 0, 2},
			{2, 0, 2, 0, 2, 0, 2},
			{2, 0, 0, 2, 0, 2, 2},
			{2, 2, 0, 2, 0, 2, 2},
			{2, 0, 0, 0, 0, 0, 2},
			{2, 2, 2, 2, 2, 0, 2},
		};
		
		int boundry = 7;
		
		String[][] result = new String[boundry][boundry];
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				if (maze[i][j] == 2) {
					result[i][j] = "X";
				} else {
					result[i][j] = "░";
				}
			}
		}
		
		List<Integer> route = new ArrayList<>();
		
		//(0, 1) is start point
		//2 means Right
		recuTry(2, 0, 1, maze, boundry, route, result);
		
		for(String[] row : result) {
			for(String cell : row) {
				System.out.print(cell);
			}
			System.out.print("\n");
		}
	}	
	
	private static void recuTry(final int previousDirection, final int currentX, final int currentY, final int[][] maze, final int boundry, List<Integer> route, String[][] result) {
		//Push current step to route
		route.add(currentX);
		route.add(currentY);
		
		//Mark successful route
		//(6, 6) 
		if(currentX == 6 && currentY == 6) {
			for(int i = 0; i < (route.size() / 2); i++) {
				result[route.get(2 * i + 1)][route.get(2 * i)] = "▓";
			}
		}
		
		//Fail, stop recu
		if(currentX < 0 || currentX >= boundry || currentY < 0 || currentY >= boundry || maze[currentY][currentX] == 2) {
			return;
		}
		
		//Loop other three direction
		else {
			//1:"Top", 2:"Right", -1:"Bottom", -2:"Left"};
			int[] allDirections = {1, 2, -1, -2};
			for(int nextDirection : allDirections) {
				if((nextDirection + previousDirection) != 0) {
					switch(nextDirection) {
						case 1:
							recuTry(nextDirection, currentX, currentY - 1, maze, boundry, route, result);
							break;
						case 2:
							recuTry(nextDirection, currentX + 1, currentY, maze, boundry, route, result);
							break;
						case -1:
							recuTry(nextDirection, currentX, currentY + 1, maze, boundry, route, result);
							break;
						case -2:
							recuTry(nextDirection, currentX -1, currentY, maze, boundry, route, result);
							break;
						default:
							//Do nothing
					};
					route.remove(route.size() - 1);
					route.remove(route.size() - 1);
				}
			}
		}
	}
	
	private static void knight() {
		
		int[][] playground = new int[8][8]; 
		boolean[] numbers = new boolean[64];
		int pointX = 4, pointY = 3;
		Node[] nodeList= new Node[64];
		for (int i = 0; i < nodeList.length; i++) {
			nodeList[i] = new Node(-1, -1, false);
			//node.changeValue(0, 0, false);
		}
		
		findWay4Ponit(playground, pointX, pointY, 1, numbers, nodeList);
		
	}
	
	static class Node {
		public int x;
		public int y;
		public boolean flag;
		Node(int x, int y, boolean flag) {
			this.x = x;
			this.y = y;
			this.flag = flag;
		}
		public void changeValue(int x, int y, boolean flag) {
			this.x = x;
			this.y = y;
			this.flag = flag;
		}
	}

	private static void findWay4Ponit(int[][] playground, int pointX, int pointY, int seq, boolean[] numbers, Node[] nodeList) {
		if (seq > 64) {
			printResult(playground);
			return;
		}
		if (pointX >= 0 && pointY >= 0 && pointX < 8 && pointY < 8 ) {
			//if (numbers[seq-1] == true) {
			if (nodeList[seq-1].flag) {
				for (int i = seq - 1; i < numbers.length; i++) {
					if (nodeList[i].flag) {
						//numbers[i] = false;
						int x = nodeList[i].x;
						int y = nodeList[i].y;
						playground[x][y] = 0;
						//nodeList[i] = new NodeList(0, 0, false);
						nodeList[i].changeValue(-1, -1, false);
					} else {
						return;
					}
					
				}
			} 
			if (playground[pointX][pointY] == 0) {
				playground[pointX][pointY] = seq;
				//numbers[seq-1] = true;
				nodeList[seq-1].changeValue(pointX, pointY, true);
				findWay4Ponit(playground, pointX-2, pointY-1, seq+1, numbers, nodeList);
				findWay4Ponit(playground, pointX-1, pointY-2, seq+1, numbers, nodeList);
				findWay4Ponit(playground, pointX+2, pointY-1, seq+1, numbers, nodeList);
				findWay4Ponit(playground, pointX+1, pointY-2, seq+1, numbers, nodeList);
				findWay4Ponit(playground, pointX-2, pointY+1, seq+1, numbers, nodeList);
				findWay4Ponit(playground, pointX-1, pointY+2, seq+1, numbers, nodeList);
				findWay4Ponit(playground, pointX+2, pointY+1, seq+1, numbers, nodeList);
				findWay4Ponit(playground, pointX+1, pointY+2, seq+1, numbers, nodeList);
			}
		}
			
		
	}

	private static void printResult(int[][] playground) {
		for (int[] row: playground) {
			for (int cell: row) {
				System.out.printf("%2d ", cell);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static boolean knightGameOver(int[][] playground) {
		for (int[] row: playground) {
			for (int cell: row) {
				if (cell == 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static void eightQueen() {
		// TODO Auto-generated method stub
		
	}
}
