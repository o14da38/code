package cn.tedu.arrays;

public class Test_3 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.brand="audi";
		car2.brand="bmw";
		car1.color = "black";
		car2.color = "white";
		car1.drive(car1.brand);
		car2.drive(car2.brand);
		Car car3 = car2;
		System.out.println(car3.brand);
	}
	
}
class Car{
	String color,brand;
	double price;
	public void drive(String a) {
		System.out.println(a+" is driving...");
	}
}
