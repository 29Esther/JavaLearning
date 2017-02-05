package chapter6;

import java.util.Scanner;

public class ArrayList_Exercise {

	public static void main(String[] args) {
		
		int [] array1= new int[]{1,2,3,4,5};
		 ArrayList list = new ArrayList();
		 list.add(100);
		 // list.add(null);
		 list.add(array1);
		 list.add("Hello");
		 list.add(true);
//		 for (int i = 0; i < list.size(); i++) {
//			 System.out.print(list.get(i));
//			 System.out.print("  ");
//		 }
//		 System.out.println();
		 System.out.println(list);
		 
		 ArrayList list1 = new ArrayList();
		 list1.add(100);
		 // list1.add(null);
		 list1.add(array1);
		 list1.add("Hello");
		 list1.add(true);
		 System.out.println(list1);
		 
		 System.out.println(list.equals(list1));
	}

}
