package chap02.type;

public class CharType {

	public static void main(String[] args) {
		// char : 2byte
		// 작은 따옴표를 이용해 하나의 문자를 표현
		
		char charValue;
		charValue = 'a'; // 작은따옴표는 하나의 문자만
		System.out.println(charValue);

//		charValue = 'ab'; //오류
//		charValue = ''; //빈문자도못가짐
		charValue = ' '; //빈 문자 (스페이스)를 가짐
		
		charValue = 44032;
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00'; // 첫번째랑 같은값 (진수)
		System.out.println(charValue);
	}

}
