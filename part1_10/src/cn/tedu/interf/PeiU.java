package cn.tedu.interf;

public class PeiU extends Teacher {
	String name = "培优";
	public void teach() {
		System.out.println(this.name+"讲课");
	}
	public void ready() {
		System.out.println(this.name+"备课");
	}
}
