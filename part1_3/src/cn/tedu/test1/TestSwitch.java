package cn.tedu.test1;

public class TestSwitch {
	public static void main(String[] args) {
		// switch支持的数据类型：int short char;
		int a = 23;
		switch (a) {
		case 1:
			System.out.println(a);
			break;
		case 23:
			System.out.println(a);
			break;
		default:
			System.out.println("默认");
		}
	}
}
