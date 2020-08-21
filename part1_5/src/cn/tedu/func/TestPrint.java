package cn.tedu.func;
/**
 * 
 * @author liufeng
 *	CAABA*DA*BCACBCB
 *	byte short int long char boolean doubld float
 *	JVM实现跨平台，JDK包含JVM所以Java可以实现跨平台
 *	单词首字母大写
 *
 */
public class TestPrint {
	public static void main(String[] args) {
		print(19);
		print(1.1);
		print("zsz");
		print(true);
	}
	public static void print(int a) {
		System.out.println(a);
	}

	public static void print(double a) {
		System.out.println(a);
	}

	public static void print(String a) {
		System.out.println(a);
	}

	public static void print(boolean a) {
		System.out.println(a);
	}
}