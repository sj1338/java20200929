package chap03.textbook;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		double a = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println("-----------------");
		
		System.out.println(Double.isInfinite(a));
		System.out.println(Double.isNaN(a));
		
		System.out.println("-----------------");
		
		System.out.println(z + 2); // 문제가 되는 코드

	}

}
