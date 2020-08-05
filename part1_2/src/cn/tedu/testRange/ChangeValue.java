package cn.tedu.testRange;

import java.util.Scanner;

public class ChangeValue {
	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = a;
		double o = a;
		System.out.println(o);
		a = b;
		b = c;
		System.out.println("a="+a+" _____________ b="+b);
		//后缀 L---long   F-----float    D-----double
		long x = 100000000000000L;
		double y = x;
		System.out.println(y);
		float z = 3.3F;
//		把int转换为double
		double m = 3d;
		int p = (int) m;
		
	}
}
