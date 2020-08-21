package cn.tedu.interf;

class Test_1InterFace {
	public static void main(String[] args) {
		new Dog().demo();
		// jdk1.8新特性
		Animal.demo2();// 访问静态方法需要接口直接调用，实现类没有
		new Dog().demo3();

		System.out.println(new Dog().a);

//		Animal.a=30;//成员a是常量
		System.out.println(Animal.a);// 变量是静态的常量
	}
}

interface Animal {
	int a = 0;// 静态常量，static public final

	void demo();//简写 abstract public

	public static void demo2() {
		System.out.println("demo2...");
	}

	public default void demo3() {
		System.out.println("demo3...");
	}

}

class Dog implements Animal {
	 public void demo() {
		System.out.println("dog");
	}
}