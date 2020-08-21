package cn.tedu.d8;

public class Test_1 {
	public static void main(String[] args) {
		Son s1 = new Son();
		s1.s_name();
	}
}

class Father {
	double money;
	String name = "fff";
}

class Son extends Father {
	String name;

	public void s_name() {
		String name = "aaa";
		System.out.println(super.name);
		System.out.println(name);
		System.out.println(this.name);
	}
}