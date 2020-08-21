package cn.tedu.arrays;

import java.util.Arrays;
import java.util.Random;

//数组方法
public class Test_1 {
	public static void main(String[] args) {
		method();// toString
	}

	public static void method() {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100) + 1;
		}
		int[] d = Arrays.copyOf(a, 9);
		System.out.println("d: " + Arrays.toString(d));
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
