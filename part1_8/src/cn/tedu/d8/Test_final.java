package cn.tedu.d8;

public class Test_final {
	public static void main(String[] args) {
		new Test_f1();
	}
}

//final class TestFinal {//The type Test_f1 cannot subclass the final class TestFinal
//	final int age = 10;
//}
class TestFinal {
	final int age = 10;
	final public void testfinal() {
		System.out.println("final foo");
	}
}

class Test_f1 extends TestFinal {
	public Test_f1() {
//		super.age=1;//The final field TestFinal.age cannot be assigned
		System.out.println(super.age);
	}
//	final public void testfinal() {//Cannot override the final method from TestFinal
//		
//	}
}
