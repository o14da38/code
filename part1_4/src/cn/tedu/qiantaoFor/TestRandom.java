package cn.tedu.qiantaoFor;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
	public static void main(String[] args) {
		int random = new Random().nextInt(100);
		int input;
		do {
			input = new Scanner(System.in).nextInt();
			if (input == random) {
				System.out.println("对啦！");
				break;
			} else if (input > random) {
				System.out.println("大了");
				continue;
			} else {
				System.out.println("小了");
				continue;
			}
		} while (true);
	}
}
