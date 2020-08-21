package cn.tudu.err;

public class Test_2 {
	public static void main(String[] args) {
		
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("狗吃");
	}
}
abstract class Animal {//抽象类
	 public abstract void eat();//抽象方法
//	 {
//		System.out.println("动物吃");
//	}
}