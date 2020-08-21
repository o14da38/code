package cn.tedu.d11;

import java.util.Arrays;

public class Test_3 {
	public static void main(String[] args) {
		char[] c = {'1','2'};
		String str1 = new String(c);
		String str2 = "哦i就仨都i啊就是都i";
		System.out.println(str1.charAt(1));
		System.out.println(str1.concat(str2));
		System.out.println(str2.endsWith("i"));
		System.out.println(str1.equals("12"));
		System.out.println(str1.indexOf("d"));
		System.out.println(str2.isEmpty());
		System.out.println(str2.lastIndexOf("啊"));
		System.out.println(str2.length());
		System.out.println(str2.hashCode());
		System.out.println(str2.toUpperCase());
		System.out.println(Arrays.toString(str2.toCharArray()));
		System.out.println(Arrays.toString(str2.getBytes()));
	}
}
