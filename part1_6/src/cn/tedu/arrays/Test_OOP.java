package cn.tedu.arrays;


public class Test_OOP {
	public static void main(String[] args) {
//		创建对象
//		new Phone();//匿名对象--- 一次只干一个活
		Phone p1 = new Phone();
//		调用
		p1.color = "black";
		p1.brand = "Apple";
		p1.size = 16.5;
		p1.price = 8000.0;
		p1.call();
		p1.message();
		p1.music();
		System.out.println(p1.color+p1.size+p1.brand+p1.size);
	}
}

class Phone {
	double size, price;
	String color, brand;

	public void call() {
		System.out.println("打电话");
	}

	public void message() {
		System.out.println("发短信");
	}

	public void music() {
		System.out.println("听音乐");
	}
}