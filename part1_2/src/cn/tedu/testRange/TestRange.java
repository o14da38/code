package cn.tedu.testRange;

public class TestRange {
	public static void main(String[] args) {
		//整数型 byte short int long
		//定义变量，记录最大值最小值
		byte test1 = 127;
		byte test2 = -128;
		System.out.println("byte---max:"+test1+" & min:"+test2);
		short test3 = Short.MAX_VALUE;
		short test4 = Short.MIN_VALUE;
		System.out.println("short---max:"+test3+" & min:"+test4);
		int test5 = Integer.MAX_VALUE;
		int test6 = Integer.MIN_VALUE;
		System.out.println("int---max:"+test5+" & min:"+test6);
		long test7 = Long.MAX_VALUE;
		long test8 = Long.MIN_VALUE;
		System.out.println("long---max:"+test7+" & min:"+test8);
		float test9 = Float.MAX_VALUE;
		float test10 = Float.MIN_VALUE;
		System.out.println("float---max:"+test9+" & min:"+test10);
		double test11 = Double.MAX_VALUE;
		double test12 = Double.MIN_VALUE;
		System.out.println("double---max:"+test11+" & min:"+test12);
		char test13 = '1';
		char test14 = 'a';
		char test15 = '是';
		//char存储的数据类型非常丰富，甚至可以直接存数字
		//但是在使用时，不会使用数字本身，而是使用数字对应的字符（ascii码表）
		char test16 = 197;
		System.out.println("char---max:"+65535+" & min:"+0+"------------单引号印起来的一个数据");
		System.out.println(test16);
	}
}
