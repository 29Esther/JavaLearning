package chapter6;

public class Exercise {

	public static void main(String[] args) {
		Some some = new Other();
		some.doService(); // 2. 
	}
	
}

class Some {
	protected int x;
	
	/* Some(int x) { // 7.
		this.x = x;
	}*/
	
	/* Some() { // 10. 会编译失败
		System.out.println("Some()");
		this(10);
	}
	
	Some(int x) {
		System.out.println("Some(int x)");
	} */
	
	// abstract void doService(); // 6. 会编译失败
	
	void doService() {
		System.out.println("some service");
	}

	String ToString() {
		return "Some instance";
	}
	
	/* int hashCode() { // 5. 会编译失败
		return 99;
	} */
}

class Other extends Some { 
	/* Other(int x) { // 7. 会编译失败
		this.x = x;
	} */

	@Override
	void doService() {
		System.out.println("other service");
	}
}
