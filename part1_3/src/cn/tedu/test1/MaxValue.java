package cn.tedu.test1;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		a = new Scanner(System.in).nextInt();
		b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		int max = a>b ? (a>c ? a : c) : (b>c ? b : c);
		System.out.println(max);
	}
}
