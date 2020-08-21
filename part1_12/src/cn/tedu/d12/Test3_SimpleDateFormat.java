package cn.tedu.d12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3_SimpleDateFormat {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(new Date()));
		String time = sdf.format(new Date().getTime());
		System.out.println(sdf.parse(time).getTime());
		System.out.println();
		System.out.println("输入出生年-月-日");
		String birth=new Scanner(System.in).next();
		long birth_mills = sdf.parse(birth).getTime();
		long now = new Date().getTime();
		long res = now - birth_mills;
		long resDays = res/1000/60/60/24;
		System.out.println(resDays+"天");
		
	}
}
