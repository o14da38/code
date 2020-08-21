package cn.tedu.d14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//集合	
public class Test_3 {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		// 集合方法调用
		c.add(23);
		c.clear();
		c.add(24);
		c.add(21);
		c.add(25);
		c.add(26);
		c.add(27);
		System.out.println(c.hashCode());
		System.out.println(c.isEmpty());
		System.out.println(c.contains(23));
		c.add(888);
		c.remove(888);
		c.add(22);
		System.out.println(c.contains(22));
		System.out.println(c.size());
		System.out.println(c.hashCode());
		System.out.println(Arrays.toString(c.toArray()));
		
		System.out.println();
		Collection<Integer> c2 = new ArrayList<>();
		c2.addAll(c);
		System.out.println(c2);
		c2.add(999);
		System.out.println(c2);
		c2.containsAll(c);
		System.out.println(c2);
//		c2.removeAll(c);//移除掉c里有的元素
		c2.retainAll(c);// 移除c集合里没有的元素，交集
		System.out.println(c2);
		
		System.out.println();
		
		//iterator 集合迭代
		Iterator<Integer> it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}