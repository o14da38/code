package cn.tudu.d15;

import java.util.ArrayList;
import java.util.HashSet;

public class Test3_HashSet {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(6);
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		set.addAll(list);
		list.addAll(set);
		System.out.println(set);
		System.out.println(list);
		set.remove(9);
		System.out.println(set);
	}
}
