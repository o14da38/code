package cn.tedu.d14;

import java.util.ArrayList;
import java.util.Collection;

//泛型
public class Test_1 {
	public static void main(String[] args) {
//		int[] a1 = { 1, 2.2, "a" }; //数组会自动检查数据类型，在编译期就会报错
//		泛型通常配合集合使用，标志<>
		Collection c = new ArrayList();
		c.add(1);
		c.add("a");
		//<泛型>必须是引用类型，不能是基本类型
		Collection<Integer> c2 = new ArrayList<>();
		c2.add(2);
//		c2.add(2);
	}
}
