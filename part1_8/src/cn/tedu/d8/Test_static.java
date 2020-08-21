package cn.tedu.d8;

public class Test_static {
	public static void main(String[] args) {
		TestStatic.print1();// 直接类名 点 静态成员
		TestStatic.name = "";// 直接类名 点 静态成员

		/** 静态资源共享 **/
		TestStatic s1 = new TestStatic();
		TestStatic s2 = new TestStatic();
		s1.name = "s1";
		s1.print1();
		s2.print1();

	}
}

class TestStatic {
	public static String name;
	int age;

	public static void print1() {
//		System.out.println(age); //非静态会报异常
//		System.out.println(this.name); //报异常：Cannot use this in a static context-
//		-----------static里不能用this------------------
		System.out.println("static foo,name: " + name);
	}
}