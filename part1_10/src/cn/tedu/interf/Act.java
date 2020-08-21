package cn.tedu.interf;

public class Act extends Teacher {
	String name = "高手";
	public void teach() {
		System.out.println(this.name+"讲课");
	}
	public void ready() {
		System.out.println(this.name+"备课");
	}
}
