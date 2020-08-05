package cn.tedu.test1;

import java.util.Scanner;

public class DaZhe {
	public static void main(String[] args) {
		/*
		 * 1.接收用户输入的原价
		 * 2.满1000打9折
		 * 3.满2000打8折
		 * 4.满5000打5折
		 */
		System.out.println("输入原价：");
		double yuanjia = new Scanner(System.in).nextDouble();
		double xianjia;
		if(yuanjia >= 1000 && yuanjia < 2000) {
			xianjia = yuanjia * 0.9;
		}else if(yuanjia >= 2000 && yuanjia < 5000) {
			xianjia = yuanjia * 0.8;
		}else if(yuanjia >=5000) {
			xianjia = yuanjia * 0.5;
		}else {
			xianjia = yuanjia;
		}
		System.out.println("折后价为：" + xianjia);
	}
}
