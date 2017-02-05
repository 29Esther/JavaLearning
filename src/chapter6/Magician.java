package chapter6;

public class Magician extends Role {
	static {
		System.out.println("Magician Static");
	}
	{
		System.out.println("Magician Dynamic");
	}
	Magician(String name, int level, int blood) {
		super(name, level, blood);
	}
	
	Magician() {
		System.out.println("Magician construction");
	}

	@Override // 在JDK5之后，Override的标注(Annotation)表示要求编译程序检查，父类中是否有该方法的定义
	public void fight() {
		System.out.println("魔法攻击");
	}
	
	public void cure() {
		System.out.println("魔法治疗");
	}
}
