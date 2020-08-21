package cn.tedu.constructor;

public class Test_6Extends {
	public static void main(String[] args) {
//		new Dog().eat();
		new Cow(6).eat("🐂");// 父类eat
//		new Cow().cat_eat();// 爷爷类eat
		new Cow(2);
	}
}

class Dog {
	public void eat() {
		System.out.println("🐶吃💩");
	}
}

class Cat {
	public void cat_eat() {
		System.out.println("🐱吃");
	}
}

class Animal extends Cat {
	public void eat(String animal) {
		super.cat_eat();
		System.out.println(animal + "吃");
	}
}

class Cow extends Animal {
	{	
		System.out.println("cow构造代码块");
	}
	public Cow(int a) {
		System.out.println("构造函数");
	}
//	public void eat(String animal) {//重写父类eat方法
//		
//	}
}