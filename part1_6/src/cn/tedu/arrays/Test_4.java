package cn.tedu.arrays;

import java.util.Arrays;

public class Test_4 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("cc");
		s1.setAge(18);
		int[] a= {5,2,1};
		s1.editVal(s1);
		System.out.println(Arrays.toString(a));
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}
}
class Student {
	public String name;
	private int age;
	public Student() {
		System.out.println(123);
	}
//	public void setAge(int a) {
//		age = a;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//
//	// 公共的获取方式 get
//	public String getName() {
//		return name;
//	}
//
//	// 公共的修改方式 set
//	public void setName(String string) {
//		// TODO Auto-generated method stub
//		name = string;
//	}
	/*
	 * 右键-->source-->gen..setters,getters
	 *
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void editVal(Student a) {
		a.name="aaa ";
	}
}