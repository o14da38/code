package cn.tedu.d13;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

//字节读取流
public class Test_2 {
	public static void main(String[] args) throws Exception {
		System.out.println(111);
		method();
		System.out.println(222);
		method2();
		// buffer比file快，因为底层在通道中维护了一个byte数组，可以定义数组长度，默认为8192
	}

	public static void method2() throws IOException {
		File f1 = new File("/Users/liufeng/Desktop/iotest/2.txt");
		System.out.println(f1.length());
		InputStream fs1 = new FileInputStream("/Users/liufeng/Desktop/iotest/2.txt");
		BufferedInputStream bs1 = new BufferedInputStream(fs1);

		int a = 0;
		long start,end;
		start = new Date().getTime();
		while ((a = bs1.read()) != -1) {// 为什么要赋值？？？？
//			System.out.println(a);
		}
		end = new Date().getTime();
		System.out.println(end - start);
		bs1.close();
	}

	private static void method() throws Exception {
		InputStream fs1 = new FileInputStream("/Users/liufeng/Desktop/iotest/2.txt");
//		System.out.println((char)fs1.read());
//		System.out.println(fs1.read());
//		System.out.println(fs1.read());
//		//	在读完全部数据后，读数为-1
//		System.out.println((char)fs1.read());// -1
//		System.out.println(fs1.read());// -1
		int a = 0;
		long start,end;
		start = new Date().getTime();
		while ((a = fs1.read()) != -1) {// 为什么要赋值？？？？
//			System.out.println(a);
		}
		end = new Date().getTime();
		System.out.println(end - start);
		fs1.close();
	}
}
