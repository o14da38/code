package cn.tedu.interf;

import java.util.Arrays;
import java.util.Scanner;

public class Testtt {
	public static void main(String[] args) {
		System.out.println("输入年份");
//		到1900年的整年有多少天
		int year = new Scanner(System.in).nextInt();
		int day = 0;
		for (int i = 1900; i <= year - 1; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				day += 366;
			} else {
				day += 365;
			}
		}
		System.out.println(day);
		System.out.println("输入月份");
//		天数加当前年，当前月，之前的的天数
		int mounth = new Scanner(System.in).nextInt();
		int t_day = 0;// 当前月有多少天
		for (int j = 1; j <= mounth - 1; j++) {
			if (mounth == 1 || mounth == 3 || mounth == 5 || mounth == 7 || mounth == 8 || mounth == 10
					|| mounth == 12) {
				day += 31;
				t_day = 31;
			} else if (mounth == 2) {
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					day += 29;
					t_day = 29;
				} else {
					day += 28;
					t_day = 28;
				}
			} else {
				day += 30;
				t_day = 30;
			}
		}
		System.out.println(day);
		// 第一行
		String[] thead = { "星期一 ", "星期二 ", "星期三 ", "星期四 ", "星期五 ", "星期六 ", "星期日 " };
		for (int k = 0; k < thead.length; k++) {
			System.out.print(thead[k]);
		}
		String[] tbody = new String[35];
		int count = day % 7;
		System.out.println(count);
		
//		给当前月数组赋值	
		for (int m = 0; m <= count; m++) {
			tbody[m] = " ";
		}
		for (int z = 1; z <= t_day; z++) {
			for (int n = count + 1; n < tbody.length; n++) {
				
			}

		}
	}
}
