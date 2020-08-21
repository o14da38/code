package cn.tedu.d12;

import java.util.Date;

public class Test2_Date {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		System.out.println(d1.getYear());
		System.out.println(d1.getMonth());
		System.out.println(d1.getDate());
		System.out.println(d1.getHours());
		System.out.println(d1.getMinutes());
		System.out.println(d1.getSeconds());
		System.out.println(d1.toLocaleString());
	}
}
