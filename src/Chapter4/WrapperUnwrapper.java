package chapter4;

public class WrapperUnwrapper {
	public static void main (String[] args) {
		Integer wrapper = 10; // 自动装箱
		int foo = wrapper; // 自动拆箱
		
		Integer i1 = 200;
		Integer i2 = 200;
		if (i1 == i2) { // (i1, i2 > 127 || i1, i2 < -128) ? false: true;
						// 这是由IntegerCache.high和low决定的
						// 可以为JVM设置启动参数来更改数值区间
		// if (i1.intValue() == i2.intValue()) { // true
		// if (i1.equals(i2)) { // true
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}
}
