package cn.tedu.constructor;

public class Test1_Contructor {
	public static void main(String[] args) {
		Student s = new Student(5);
		String aab = new String("aab");
		new Student2("xiaoming",10);
	}
}
class Student{
	public Student() {
		System.out.println("构造方法1");
	}
	public Student(int a) {
		System.out.println("构造方法2");
	}
}
class Student2{
	private String name;
	private int age;
	public Student2(String n, int a){
		name = n;
		age = a;
	}
}