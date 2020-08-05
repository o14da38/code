package cn.tedu.test1;

public class TestFor {
	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
		// 10～0
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		// 8,88,888,8888

		for (int i = 8; i <= 8888; i = 10 * i + 8) {
			System.out.println(i);
		}
//		奇数的个数&偶数的和
		int jishuSum = 0;
		int oushuSum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				oushuSum += i;
			} else {
				jishuSum++;
			}
		}
		System.out.println("偶数的和为：" + oushuSum);
		System.out.println("奇数的个数为：" + jishuSum);
	}
}
