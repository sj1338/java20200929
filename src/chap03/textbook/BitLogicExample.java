package chap03.textbook;

public class BitLogicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		
		//bit shift 연산자
		// << : 각 bit를 왼쪽으로 옮김, 오른쪽은 0으로 채움 // 10진수면 x10, 2진수면 x2
		// >> : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(Most Significant Bit) 최상위 비트로 채움
		// >>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 0으로 채움
		
		int val = 3;
		int res = val << 3; // x8
		System.out.println(res);
		
		val = 15;
		res = val >> 1;
		System.out.println(res);
		
		val = -17;
		res = val >> 1;
		System.out.println(res);
		
		val = 98;
		res = val >>> 2;
		System.out.println(res);
		
		val = -17;
		res = val >>> 1;
		System.out.println(res);
	}
	

}
