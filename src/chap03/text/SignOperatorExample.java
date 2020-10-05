package chap03.text;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		//short result = -s; // 컴파일 에러 (-로 연산을 하면 int가 됨)
		int result3 = -s;
		System.out.println("result3" + result3);
	}

}
