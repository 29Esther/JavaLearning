package chapter6;

public class SwordsMan extends Role{
	SwordsMan(String name, int level, int blood) {
		super(name, level, blood);
	}

	@Override 
	public void fight() {
		System.out.println("挥剑攻击");
	}
}
