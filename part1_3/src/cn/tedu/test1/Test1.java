package cn.tedu.test1;

public class Test1 {
	public static void main(String[] args) {
		System.out.println(3/2);//int / int = int -->只会保存整数
		System.out.println(3d/2);// 计算结果的数据类型，与最大类型一致；
		/*
		 * byte short char 三种比int小的整数，运算时会先自动转换成int；
		 */
		byte a = 3;
		byte b = 4;
		byte c = (byte)(a+b);
		System.out.println(c);
		/*
		 * 整数运算溢出（多发生在超大整数运算）
		 */
		//光年的长度
		final long v = 300000000;
		System.out.println(300000000d*60*60*24*365);
		System.out.println(v*60*60*24*365);
		/*
		 * 浮点数运算不精确
		 */
		System.out.println(0.9-0.8);
		/*
		 * 浮点数运算特殊值
		 */
		System.out.println(3.14/0); //无穷大 ∞
		System.out.println(0/0.0); //NaN
		int aa = 1;
		--aa;
		double bb = 1d;
		System.out.println(aa!=bb|bb==aa);
		System.out.println(aa == bb);
		
		
	}
}
