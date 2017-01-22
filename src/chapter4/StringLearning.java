package chapter4;

public class StringLearning {

	public static void main(String[] args) {
		// String <=> char[]
		char[] kevin = {'K', 'e', 'v', 'i', 'n'}; // 在Java中, char是严格的'', String是""
		String boy = new String(kevin);
		System.out.println(boy);
		
		String girl = "Esther";
		char[] esther = girl.toCharArray();
		System.out.println(esther.length);
		
		// 可以将字符串转换成各类基本类型
		String number = "123";
		System.out.println(Integer.parseInt(number)); // 基本格式就是 类.parse类(string)
		
		// 字符串常量与字符串池
		char[] name = {'J', 'a', 'y'};
		String name1 = new String(name);
		String name2 = new String("Jay");
		String name3 = "Jay"; // 字符串常量
		String name4 = "Jay"; // 字符串常量
		System.out.println(name1 == name2); // false
		System.out.println(name1 == name3); // false
		System.out.println(name3 == name4); // true 因为指向字符串池里的同一个字符串常量
		
		String text1 = "Ja";
		String text2 = text1 + "va";
		String text3 = "Java";
		String text4 = "Ja" + "va";
		System.out.println(text3 == text4); // true
		System.out.println(text2 == text3); // false 因为+会返回一个new String
		
		// String text2 = text1 + "va" + "Script"; // + 会返回新的对象，占用内存块
		StringBuilder builder = new StringBuilder();
		String text5 = builder.append(text1).append("va").append("Script").toString(); // 返回同一对象，数量越多，优势越明显
		System.out.println(text3 == text5);
		
	}

}
