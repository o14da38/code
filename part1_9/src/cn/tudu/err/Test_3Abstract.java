package cn.tudu.err;

import java.io.Reader;

public class Test_3Abstract {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		System.out.println(d.an);
	}
}

//抽象类+抽象方法
abstract class Animal2 {
	int an=2;
	public Animal2() {
		System.out.println("anim..gouzao");
	}
	public abstract void sleep();

	public abstract void eat();
}

class Dog2 extends Animal2{

	public Dog2() {
		System.out.println("dog2 gouzao");
	}
	public void sleep() {
		System.out.println();
	}
	public void eat() {
		
	}
}
class Cat2 extends Reader{
	public int read(char[] a,int b,int c){
		return 1;
	}
	public void close() {
		System.out.println();
	}
}