package chapter6;

// 类被标注为abstract，表示这个类含抽象方法，定义不完整，不能用来生成实例
public abstract class Role {
	static {
		System.out.println("Role Static");
	}
	{
		System.out.println("Role Dynamic");
	}
	private String name;
	private int level;
	private int blood;
	
	public int getBlood() {
		return blood;
	}
	
	public void setBlood(int blood) {
		this.blood = blood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	Role(String name, int level, int blood) {
		this.name = name;
		this.level = level;
		this.blood = blood;
	}
	
	Role() {
		System.out.println("Role construction");
	}

	// 如果某区块真的没有任何程序代码操作，可以使用abstract表示该方法为抽象方法，同时类也要被标注为abstract
	public abstract void fight();

}
