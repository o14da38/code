package cn.tudu.err;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_1Exception {
	public static void main(String[] args)  {
//		method();
		try {
			method2();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void method2() throws Exception, InputMismatchException{
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		System.out.println(a / b);
	}

	public static void method() {
//		int a = new Scanner(System.in).nextInt();
//		int b = new Scanner(System.in).nextInt();
//		double c = (double)a / b;
//		System.out.println(c);

//		System.out.println(a / b);

		try {
			int a = new Scanner(System.in).nextInt();
			int b = new Scanner(System.in).nextInt();
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("请输入正确的数据");
		}
	}
}
