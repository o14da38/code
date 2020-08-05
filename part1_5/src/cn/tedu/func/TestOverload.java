package cn.tedu.func;
//重载！！！！！
public class TestOverload {
	public static void main(String[] args) {
		add(1, 2);// sum
		add(1, 2, "jack");
		add("jack", 1, 2);
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add(int a, int b, String c) {
		System.out.println(a + b + c);
	}

	public static void add(String c, int a, int b) {
		System.out.println(c + a + b);
	}
}
