package cn.tedu.qiantaoFor;

import java.util.Scanner;

public class QiantaoFor {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 && j == 3) {
					System.out.print("*");
				} else if (i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4) {
					System.out.print("* ");
				} else if (i == 3 && j == 3) {
					System.out.print("* ");
				} else if (i == 5) {
					System.out.print("* ");
				} else if (i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4) {
					System.out.print("* ");
				} else if (i == 6 && j == 3) {
					System.out.print("* ");
				} else if (i == 7 && j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i + "=" + i * j + "	");
			}
			System.out.println();
		}
		System.out.println();
//		猜数字
		for (int i = 0; i < 100; i++) {
			int input = new Scanner(System.in).nextInt();
			if (input == 88) {
				break;
			} else {
				continue;
			}
		}
	
	}
}
