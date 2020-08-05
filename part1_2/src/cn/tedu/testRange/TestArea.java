package cn.tedu.testRange;

import java.util.Scanner;

public class TestArea {
	public static void main(String[] args) {
		final double pai = 3.14;
		//动态接收键盘输入的值
		double r = new Scanner(System.in).nextDouble();
		
		double area = pai*r*r;
		double length = pai*r*2;

		System.out.println("面积："+area);
		System.out.println("周长："+length);
		
	}
}
