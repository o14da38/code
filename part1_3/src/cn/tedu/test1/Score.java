package cn.tedu.test1;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		/*
		 * 1.接收输入分数
		 * 2.判断，输出等级
		 * 90～优秀
		 * 80～89 良好
		 * 70～79 中等
		 * 60～69 及格
		 * ～60 不及格
		 */
		String level;
		System.out.println("请输入分数");
		int score = new Scanner(System.in).nextInt();
		if(score >= 90) {
			level = "优秀";
		}else if(score >=80 && score <=89) {
			level = "良好";
		}else if(score >=70 && score <=79) {
			level = "中等";
		}else if(score >=60 && score <=69) {
			level = "及格";
		}else {
			level = "不及格";
		}
		System.out.println("分数为："+score+" ------ 等级为："+level);
		
	}
}
