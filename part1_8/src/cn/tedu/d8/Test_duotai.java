package cn.tedu.d8;

public class Test_duotai {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		System.out.println();
		Animal a = new Dog();// 父类引用指向子类对象；
		a.eat();//父类eat方法有不同的输出结果就是多态
		
		System.out.println(a.ani2);
		System.out.println(a.ani);
	}
}

class Dog extends Animal {
	int dog = 1;
	int ani2 = 10;
	static int ani = 3;
	public void eat() {
		super.eat();
		System.out.println("狗吃屎");
		super.eat();
	}
}

class Animal {
	static int ani = 2;
	int ani2 = 5;
	public void eat() {
		System.out.println("啥都吃");
	}
}