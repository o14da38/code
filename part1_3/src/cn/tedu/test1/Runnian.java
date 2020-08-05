package cn.tedu.test1;

import java.util.Scanner;

public class Runnian {
	public static void main(String[] args) {
		System.out.println("请输入年份：");
		int year = new Scanner(System.in).nextInt();
		//判断平年闰年
		//1.能被4整除，并且不能被100整除；
		//2.能被400整除
		String isRunnian;
		isRunnian = year%4 == 0 && year%100 !=0 || year%400 == 0 ? "闰年" : "平年";
		System.out.println(year+"年是："+isRunnian);
	}
}
