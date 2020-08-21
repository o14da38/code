package cn.tedu.d8;

public class Test_3 {
	public static void main(String[] args) {
		new Zi();
	}
}

class Fu {
	public Fu() {
		System.out.println("Fu的构造");
	}
}

class Zi extends Fu {
	public Zi() {
		// 隐藏着一行代码 super(); 如果父类不提供无参构造，则会报错 -- 需要手动调用super（参数）；
		super();
		System.out.println("Zi的构造");
	}
}