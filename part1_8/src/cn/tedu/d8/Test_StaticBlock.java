package cn.tedu.d8;

public class Test_StaticBlock {
	public static void main(String[] args) {
		new StaticDemo().demo1();
		System.out.println();
		new StaticDemo();//静态代码块只加载一次
	}
}

class StaticDemo {
	static {
		//完成项目的初始化工作
		System.out.println("静态代码块...");
	}
	{
		System.out.println("构造代码块");
	}

	public StaticDemo() {
		System.out.println("构造函数...");
	}
	public void demo1() {
		System.out.println("成员函数");
		{
			System.out.println("局部代码块");
		}
	}
}