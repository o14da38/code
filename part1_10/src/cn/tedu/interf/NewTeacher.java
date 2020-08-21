package cn.tedu.interf;

public class NewTeacher {
	public static void main(String[] args) {
		Teacher t1 = new PeiU();
		Teacher t2 = new Act();
		t1.teach();
		t1.ready();
		t2.teach();
		t2.ready();
	}
}
