package chapter6;

import java.util.Scanner;

public class Guest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		String name;
		while (true) {
			System.out.print("访客名称：");
			name = scanner.nextLine();
			if (name.equals("quit")) {
				break;
			}
			list.add(name);
		}
		System.out.println("房客名单：");
		for(int i = 0; i < list.size(); i++) {
			String guest = (String) list.get(i);
			System.out.println(guest.toUpperCase());
		}
	}

}
