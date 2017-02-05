package chapter6;

import java.util.Arrays;

public class ArrayList {
	private Object[] list; // 使用Object数组收集
	private int next; // 下一个可存储对象的索引
	
	public ArrayList(int capacity) { // 指定初始容量
		list = new Object[capacity];
	}
	
	public ArrayList() {
		this(16); // 初始容量默认为16
	}
	
	public void add(Object o) { // 收集对象方法
		if (next == list.length) { // 自动增长Object数组长度
			list = Arrays.copyOf(list, list.length*2);
		}
		list[next++] = o;
	}
	
	public Object get(int index) { // 依索引取得收集的对象
		return list[index];
	}
	
	public int size() { // 已收集的对象个数
		return next;
	}
	
	public String toString() {
		if (this.size() == 0) {
			return "";
		}
		list = Arrays.copyOf(list, this.size());
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				list[i] = list[i].toString();
			}
		}
		return Arrays.toString(list);
	}
	
	public boolean equals(ArrayList list1) {
		if (this.size() != list1.size()) {
			return false;
		}
		list = Arrays.copyOf(list, this.size());
		for (int i = 0; i < list.length; i++) {
			if (!list[i].equals(list1.get(i))) {
				return false;
			}
		}
		return true;
	}
}
