package cn.tedu.interf;

public class Test_2 {
	public static void main(String[] args) {
		Imp d2 = new Imp();
		d2.demo();
		d2.demo2();
		d2.test();
		d2.fa();
	}
}

interface Demo1 {
	void demo();
}

interface Test {
	void test();
}

interface Demo2 extends Demo1, Test {
	void demo2();
}

class Father{
	public void fa() {
		System.out.println("fa.....");
	}
}
class Imp extends Father implements Demo2 {

	@Override
	public void demo() {
		System.out.println("demo实现");
	}

	@Override
	public void test() {
		System.out.println("test实现");
	}

	@Override
	public void demo2() {
		System.out.println("demo2实现");
	}
}