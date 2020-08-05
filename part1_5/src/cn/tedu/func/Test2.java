package cn.tedu.func;

public class Test2 {
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
					System.out.print(value + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("输入参数为null");
		}
	}
}
