package cn.tedu.d14;

import java.util.ArrayList;
import java.util.List;

public class Test_4 {
	public static void main(String[] args) {
//		创建List对象
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		b.add(9);
		b.add(8);
		b.add(7);
		b.add(6);
		b.add(null);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(null);
		System.out.println(a);
//		a.addAll(b);
		System.out.println(b);

		System.out.println(a.containsAll(b));// a包含b？
//		a.retainAll(b);
//		a.removeAll(b);
		System.out.println(a);
		System.out.println();
		System.out.println(a.get(2));
		System.out.println(a.indexOf(2));
		System.out.println(a.lastIndexOf(2));
		a.remove(2);
		System.out.println(a);
		a.set(0, 1);
		a.add(3, 7);
		System.out.println(a);
		a.subList(1, 3);
		System.out.println();
		for (Integer item : a) {
			System.out.println(item);
		}
	}
}
