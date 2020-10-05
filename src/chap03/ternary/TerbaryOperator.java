package chap03.ternary;

public class TerbaryOperator {

	public static void main(String[] args) {
		
		// 1항 ? 2항 : 3항
		// a ? b : c
		// a가 true 면 b이고, a가 false 면 c다
		// 위 연산의 결과는 b 또는 c
		
	
		boolean a = true;
		int b = 3;
		int c = 5;
		
		System.out.println(a ? b : c);
	}

}
