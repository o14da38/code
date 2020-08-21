package cn.tedu.d12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test_5 {
	public static void main(String[] args) {
		File f1 = new File("/Users/liufeng/Desktop/iotest/2.txt");
		System.out.println(f1.length());// 字节量
		System.out.println(f1.exists());// 文件是否存在
		System.out.println(f1.isFile());// 是不是文件

		System.out.println(f1.isDirectory());// 是不是文件夹
		System.out.println(f1.getName());// 获取文件名
		System.out.println(f1.getParent());// 获取父级路径
		System.out.println(f1.getAbsolutePath());// 获取绝对路径
		System.out.println("+=================");
		f1 = new File("/Users/liufeng/Desktop/iotest/78oho");
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		} // 新建文件（不存在的）
		f1 = new File("/Users/liufeng/Desktop/iotest/a.txt");
		System.out.println(f1.mkdir());// 新建文件夹（不存在的）
		f1 = new File("/Users/liufeng/Desktop/iotest/x/y/z");
		System.out.println(f1.mkdirs());// 新建多层文件夹（不存在的）
		f1 = new File("/Users/liufeng/Desktop/iotest/x/");
//		f1 = new File("/Users/liufeng/Desktop/iotest/1.txt");
		System.out.println(f1.delete());// 删除文件和“空的“文件夹
//		
		f1 = new File("/Users/liufeng/Desktop/iotestasdsd");
		String[] strs = f1.list();// 列出文件夹里的数据（名称）
		System.out.println(Arrays.toString(strs));
//		
		File[] fs = f1.listFiles();// 获取文件夹里的数据 --> 封装成File对象存进数组
		System.out.println(Arrays.toString(fs));

		System.out.println("---------------Test---------------");
		System.out.println("输入文件路径");
		File f2 = new File(new Scanner(System.in).next());
		try {
			while (!testFoo(f2)) {
				f2 = new File(new Scanner(System.in).next());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean testFoo(File f2) throws Exception {
		if (f2.createNewFile() || f2.mkdir()) {
			f2.delete();
			System.out.println("路径错误，从新输入");
			return false;
		} else {
			File[] fileList = f2.listFiles();
			long fileSum = 0;
			for (int i = 0; i < fileList.length; i++) {
				if (fileList[i].isFile()) {
					System.out.println("文件" + fileList[i].getName() + "大小为：" + fileList[i].length());
					fileSum += fileList[i].length();
				} else {
					System.out.println(fileList[i].getName() + "是文件夹");
				}
			}
			System.out.println("________________");
			System.out.println("所有文件总大小：" + fileSum + "字节");
			return true;
		}
	}
}
