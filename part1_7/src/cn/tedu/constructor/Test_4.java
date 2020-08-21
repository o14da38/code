package cn.tedu.constructor;

public class Test_4 {
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo e = new Demo();
		d.test(d);
	}
}

class Demo {
	int count = 20;

	public Demo() {
//		this(7789);
		System.out.println("demo1");
	}

	public Demo(int a) {
		this();
		System.out.println(a);
	}

	public void test(Demo aa) {
		int count = 10;
		System.out.println(this == aa);
		System.out.println(this == new Demo());
		System.out.println(count);
	}
}