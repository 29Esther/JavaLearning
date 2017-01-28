package chapter5;

public class test {

	public static void main(String[] args) {
		int[][] pl = new int[2][2];
		pl[0][0] = 10;
		pl[1][1] = 10;
		for (int[] row: pl) {
			for (int cell: row) {
				System.out.print(cell);
			}
			System.out.println();
		}
		
		pl = new int[2][2];
		for (int[] row: pl) {
			for (int cell: row) {
				System.out.print(cell);
			}
			System.out.println();
		}
	}

}
