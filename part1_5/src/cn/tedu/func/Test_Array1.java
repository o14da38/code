package cn.tedu.func;

import java.util.Random;

public class Test_Array1 {
	public static void main(String[] args) {
		method();
		method2();
		method3();
	}

	public static void method() {
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < days.length; i++) {
			System.out.println(i + 1 + "月有 " + days[i] + "天");
		}
	}

	public static void method2() {
		int[] arr = new int[10];
		for (int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

	public static void method3() {
		int[] arr = new int[10];
		System.out.println("----------------作业 start ------------------");
		for (int j = 0; j < arr.length; j++) {
			arr[j] = new Random().nextInt(101);
			System.out.println(arr[j]);
		}
		System.out.println("----------------作业 end ------------------");
	}
}
