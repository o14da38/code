package cn.tedu.d12;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test_4 {
	public static void main(String[] args) {
//		method();
		method2();
	}

	private static void method() {
		//接受输入两位小数	两个
		System.out.println("输入a");
		double a = new Scanner(System.in).nextDouble();
		System.out.println("输入b");
		double b = new Scanner(System.in).nextDouble();
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
	}
	private static void method2() {
		//接受输入两位小数	两个
		System.out.println("输入a");
		double a = new Scanner(System.in).nextDouble();
		System.out.println("输入b");
		double b = new Scanner(System.in).nextDouble();
		//BigDecimal
		BigDecimal bd1 = new BigDecimal(a+"");
		BigDecimal bd2 = new BigDecimal(b+"");
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.multiply(bd2));
		System.out.println(bd1.divide(bd2, 5, BigDecimal .ROUND_HALF_UP));
	}
}
