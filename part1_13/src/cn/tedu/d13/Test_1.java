package cn.tedu.d13;

import java.io.File;
import java.util.Scanner;
//             /Users/liufeng/Desktop/iotest
public class Test_1 {
	public static void main(String[] args) {
		System.out.println("输入文件夹路径");
		File dir = new File(new Scanner(System.in).nextLine());
		long value = sizeOf(dir);
		System.out.println("总大小：" + value);
	}

	private static long sizeOf(File dir) {
		long size = 0;
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile()) {
				size += files[i].length();
				System.out.println("文件" + files[i].getName() + "大小为：" + files[i].length());
			} else {
				System.out.println(files[i].getName() + "是文件夹");
				size+=sizeOf(files[i]);
			}
		}
		return size;
	}
}
