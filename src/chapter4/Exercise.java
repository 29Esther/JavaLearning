package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String no = scanner.next();
		
		switch (no){
			case "A":
				int number = scanner.nextInt();
				System.out.println(Arrays.toString(finbonacci(number)));
				break;
			case "B":
				cardsReorder();
				break;
			case "C":
				int[] numbers3 = {70, 80, 31, 37, 10, 1, 48, 60, 33, 80};
				System.out.println(Arrays.toString(sortArray(numbers3)));
				break;
			case "D":
				int[] numbers4 = {1, 10, 31, 33, 37, 48, 60, 70, 80};
				int number4 = scanner.nextInt();
				System.out.println(findNumber(numbers4, number4));
				break;
			default:
				break;
		}
	}
	
	/*
	 * 1. input: number of 费式数
	 *    output: number个费式数组
	 */
	private static int[] finbonacci(int number) {
		int[] answer = new int[number];
		if (number <= 1) {
			answer[number] = number;
		} else {
			answer[1] = 1;
			for (int i = 2; i < number; i++) {
				answer[i] = answer[i-1] + answer[i-2];
			}
		}
		return answer;
	}
	
	/*
	 * 2. 洗牌
	 */
	private static String[] cardsReorder() {
		String[] answer = new String[13*4];
		String[] colors = {"桃", "砖", "梅", "心"};
		// String[] values
		String[] values = new String[13];
		for (int i = 0; i < 10; i++) {
			values[i] = Integer.toString(i+1);
		}
		values[10] = "J";
		values[11] = "Q";
		values[12] = "K";
		
		int j = 0;
		do {
			for (String color: colors) {
				for (String value: values) {
					answer[j] = color + " " + value;
					j++;
				}
			}
		} while (j < 13*4);
		
		int number = (int) (Math.random() * 500);
		for (int i = 0; i < number; i++) {
			int a = (int) (Math.random() * 13 * 4);
			int b = (int) (Math.random() * 13 * 4);
			swap(answer, a, b);
		}
		
		for (int i = 0; i < 4; i ++) {
			for (int h = 0; h < 13; h ++) {
				System.out.printf("%s ", answer[13*i+h]);
			}
			System.out.println();
		}
		return answer;
	}

	private static void swap(String[] answer, int a, int b) {
		String tmp = answer[a];
		answer[a] = answer[b];
		answer[b] = tmp;
	}

	/*
	 * 3. 固定数组排序
	 */
	private static int[] sortArray(int[] numbers) {
		int[] answer = Arrays.copyOf(numbers, numbers.length);
		for (int i = 1; i < answer.length; i ++) {
			int value = answer[i];
			for (int k = i; k >= 0; k --) {
				if (k!= 0 && value < answer[k-1]) {
					answer[k] = answer[k-1];
				} else {
					answer[k] = value;
					break;
				}
			}
		}
		return answer;
	}
	
	/*
	 * 4. 在固定数组中找到某值
	 */
	private static int findNumber(int[] numbers, int number) {
		for (int i = 1; i < numbers.length; i ++) {
			if (numbers[i] == number) {
				return i;
			}
		}
		return -1;
	}
}
