package chapter4;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] scores = {88, 81, 74, 68};
		scores[3] = 90;
		// scores[4] = 80; //报错: java.lang.ArrayIndexOutOfBoundsException
		for (int score: scores) {
			System.out.printf("Score: %d%n", score);
		}
		
		int[][] matrix = {
			{1, 2, 3},
			{4, 5, 6}
		};
		for (int[] row: matrix) {
			for (int value: row) {
				System.out.printf("%2d ", value);
			}
			System.out.println();
		}
		
		/*
		 * 使用 new 建立数组后，每个索引元素会有默认值
		 * 
		 * | Type          | byte | short | int | long | float | double | char   | boolean | class |
		 * | Initial Value | 0    | 0     | 0   | 0L   | 0.0F  | 0.0D   | \u0000 | false   | null  |
		 * 
		 * */
		int[] array2 = new int[5];
		System.out.println(array2); // [I@74a14482 是指向array2的指针？
		System.out.println(Arrays.toString(array2));  // [0, 0, 0, 0, 0]
		Arrays.fill(array2, 80);
		System.out.println(Arrays.toString(array2)); // [80, 80, 80, 80, 80]
		
		/*
		 * 以上，都是通过基本类型建立的数组，下面介绍通过类类型建立数组
		 */
		Integer[] array3 = new Integer[3]; // 建立了0个Integer对象，因为每个索引都参考null
		for (Integer score: array3) {
			System.out.printf("%d ", score); // null null null
		}
		
		/*
		 * 复制数组
		 *  以下两种复制方法都是浅层复制，生成不同的数组对象，但是每一对象最后都会指向同一对象
		 */
		int[] exampleArray = {1, 2, 3, 4};
		int[] copyArray1 = exampleArray; //指向同一个对象，并不是复制
		
		int[] copyArray2 = Arrays.copyOf(exampleArray, exampleArray.length); // JDK6以上
		
		int[] copyArray3 = new int[exampleArray.length];
		System.arraycopy(exampleArray, 0, copyArray3, 0, exampleArray.length); // 原始方法
	}

}
