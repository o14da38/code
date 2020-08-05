package cn.tedu.func;

public class TestArray {
	public static void main(String[] args) {
		boolean[] a = new boolean[8]; // 动态初始化
		System.out.println(a[6]);
		int[] b = { 1, 2, 3, 4 };
		int[] c = new int[] { 1123, 2314 };
		System.out.println(b[0]);
		System.out.println(c[1]);
		System.out.println();
		char[] d = new char[5];
		d[0] = 'h';
		d[1] = 'e';
		d[2] = 'l';
		d[3] = 'l';
		d[4] = 'o';
		System.out.println(d[0]);
		String[] x = new String[] { "hello" };
		String[] f = { "hello" };
		System.out.println(x[0] + "-------" + f[0]);
	}
}
