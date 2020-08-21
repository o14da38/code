package cn.tedu.d13;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test_3 {
	public static void main(String[] args) throws IOException {
		method();
		method2();
	}

	private static void method2() throws IOException {
		BufferedOutputStream bfOut1 = new BufferedOutputStream(new FileOutputStream("/Users/liufeng/Desktop/iotest/3.txt",true));
		bfOut1.write(78);
		bfOut1.write(78);
		bfOut1.write(78);
		bfOut1.write(78);
		bfOut1.close();
		
	}

	private static void method() throws IOException {
		OutputStream os1= new FileOutputStream("/Users/liufeng/Desktop/iotest/3.txt",true);
		os1.write(39);
		os1.write(40);
		os1.write(41);
		os1.close();
	}
}
