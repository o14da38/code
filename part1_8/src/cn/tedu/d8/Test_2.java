package cn.tedu.d8;

public class Test_2 {
	public static void main(String[] args) {
		Son2 s1 = new Son2();
		s1.s_name();
	}
}

class Father2 {
	double money;
	String name = "fff";
	public void fu_foo() {
		
	}
}

class Son2 extends Father2 {
	String name;

	public void s_name() {
		String name = "aaa";
		System.out.println(super.name);
		System.out.println(name);
		System.out.println(this.name);
	}
}