package cn.tedu.d11;

public class Test4_StringBuilder {
	public static void main(String[] args) {
		method();
		method2();
	}

	private static void method2() {
		String str = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		//计时开始
		long start = System.currentTimeMillis();
		for(int i=1;i<=10000;i++) {
			sb.append(str);
		}
		//计时结束
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

	public static void method() {
		String str = "abcdefghijklmnopqrstuvwxyz";
		String s = "";
		//计时开始
		long start = System.currentTimeMillis();
		for(int i=1;i<=10000;i++) {
			s.concat(str);
		}
		//计时结束
		long end = System.currentTimeMillis();
		System.out.println(end-start);
//		System.out.println(s);
	}
}
