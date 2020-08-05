package cn.tedu.func;

import java.util.Scanner;

public class Test_1 {
	int b = 3;

	public static void main(String[] args) {
		Test_1 c1 = new Test_1();
		c1.showNumber(2, 3);
		c1.showNumber();
		System.out.println(c1.a(7));
		String info = c1.add2(new Scanner(System.in).nextLine(), new Scanner(System.in).nextInt(),
				new Scanner(System.in).nextLine());
		System.out.println(info);
	}

	private String add2(String string, int i, String string2) {
		return string + i + string2;
	}

	public int a(int aa) {
//		System.out.println(a);
		return aa;
	}

	public void showNumber(int... value) {
		//  输入参数不是null,注意：没有给定参数时候，value!=null
		if (value != null) {
// 首先判断这个方法是否给定了参数，如果没有给，输出提示信息
			if (value.length == 0) {
				System.out.println("方法没有参数！");
			}
// 如果给了参数，那么输出全部
			else {
// 需要注意的是，value是一个数组，取值时候用遍历数组的方式进行
				for (int i = 0; i < value.length; i++) {
					System.out.print(value[i] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("输入参数为null");
		}
	}

}
