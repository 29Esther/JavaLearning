package chapter5;

public class Note {

	/*
	 * Chapter 5: 对象封装
	 */
	public static void main(String[] args) {
		CashCard card1 = new CashCard("A001", 500, 0);
		// card1参考的对象也让some的参数card参考
		some(card1);
		System.out.println(card1.getNumber()); // A100
		
		CashCard card2 = new CashCard("A002", 500, 0);
		// card2参考的对象也让的参数card参考
		other(card2);
		System.out.println(card2.getNumber()); // A002
		
		// 这是因为调用函数时，是传值调用
	}

	public static void some(CashCard card) {
		card.setNumber("A100");
	}
	
	public static void other(CashCard card) {
		// 建立新的CashCard对象，并让card参考
		card= new CashCard("A003", 500, 0);
	}
}

class MathTool {
	// 不定长度自变量，在声明参数列时要在类型关键字后加上...，通过用增强式for循环来取得不定长度自变量中的每一个元素
	public static int sum(int... numbers) {
		int sum = 0;
		for (int number: numbers) {
			sum += number;
		}
		return sum;
	}
}
