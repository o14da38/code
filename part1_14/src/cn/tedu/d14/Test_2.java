package cn.tedu.d14;

public class Test_2 {
	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5 };
		print(a);
		String[] s = { "2", "223" };
		print(s);
	}

	/*
	 * l E - Element (在集合中使用，因为集合中存放的是元素)
	 * 
	 * l T - Type（Java 类）
	 * 
	 * l K - Key（键）
	 * 
	 * l V - Value（值）
	 * 
	 * l N - Number（数值类型）
	 * 
	 * l ? - 表示不确定的java类型
	 */
	private static <T> void print(T[] a) {
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		for (T item : a) {
			System.out.println(item);
		}
	}
}
