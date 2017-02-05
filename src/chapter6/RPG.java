package chapter6;

public class RPG {
	// 多态
	public static void showBlood(Role role) {
		System.out.printf("%s 血量 %d%n", role.getName(), role.getBlood());
	}
	
	public static void drawFight(Role role) {
		System.out.println(role.getName());
		role.fight();
	}

	public static void main(String[] args) {
//		SwordsMan swordsMan = new SwordsMan("Justin", 1, 200);
//		Magician magician = new Magician("Monica", 1, 100);
//		
//		showBlood(swordsMan); // SwordsMan is-a Role
//		showBlood(magician); // Magician is-a Role
//		
//		drawFight(swordsMan); // 实际操作的是SwordsMan实例
//		drawFight(magician); // 实际操作的是Magician实例
		
		Role role1 = new Magician();
		Magician role2 = new Magician();
		Magician role3 = new Magician();
	}

}
