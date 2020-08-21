package cn.tedu.constructor;

public class Test_3 {
	public static void main(String[] args) {
//		new Person(2);
//		new Person();
		System.out.println(new Person().getP());
	}
}

class Person {
	String p;
	{
		System.out.println("构造代码块");
		p = "p";
	}

	public Person() {
		System.out.println(p + "1");
	}

	public Person(int a) {
		System.out.println(p + "2 " + a);
	}
	
	public String getP() {
		System.out.println(123);
		{
			return p;
		}
	}
}