package cn.tudu.err;

public class Test_5 {
	public static void main(String[] args) {
		Teacher t1 = new PeiU();
		Teacher t2 = new Gao();
		
	}
}
abstract class Teacher{
	abstract public void ready();
	abstract public void teach();
}
class PeiU extends Teacher{
	 public void ready() {
		 System.out.println("培优备课");
	 }
	 public void teach() {
		 System.out.println("培优讲课");
	 }
}
class Gao extends Teacher{
	 public void ready() {
		 System.out.println("高手备课");
	 }
	 public void teach() {
		 System.out.println("高手讲课");
	 }
}