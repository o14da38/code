package cn.tedu.d13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Test_4 {
	public static void main(String[] args) throws IOException {
		System.out.println("读取文件路径：");
		InputStream in = new FileInputStream(new Scanner(System.in).nextLine());
		System.out.println("写出文件路径：");
		OutputStream out = new FileOutputStream(new Scanner(System.in).nextLine(),true);
		copyOf(in,out);
	}

	private static void copyOf(InputStream in, OutputStream out) throws IOException {
		int a = 0;
		BufferedInputStream bf_in = new BufferedInputStream(in);
		BufferedOutputStream bf_out = new BufferedOutputStream(out);
		while((a=bf_in.read())!=-1) {
			bf_out.write(a);
			System.out.println(a);
		}
		bf_in.close();
		bf_out.close();
		System.out.println("复制成功");
	}
}
