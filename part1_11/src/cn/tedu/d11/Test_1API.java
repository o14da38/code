package cn.tedu.d11;

public class Test_1API {
	public static void main(String[] args) {
		Object t1 = new Object();
		System.out.println(t1.toString());
		System.out.println(t1.equals(t1));
		System.out.println(t1.hashCode());
		System.out.println(Integer.toHexString(t1.hashCode()));
	}
}
