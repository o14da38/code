package cn.tedu.d12;

public class Test_1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(5);
		int i2 =  Integer.valueOf(5);
		System.out.println(i1.intValue());
		System.out.println(Integer.parseInt("2")+3);
		
		System.out.println();
		
		Double d1 = new Double(5.5);
		Double d2 = Double.valueOf(5.5);
		System.out.println(Double.parseDouble("2.3")+3.2);
	}
}
