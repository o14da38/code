package cn.tudu.d15;

import java.util.LinkedList;

public class Test2_Linked {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("f");
		list.addFirst("ff");
		list.add("sds");
		list.addLast("l");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list);
		
	}
}
