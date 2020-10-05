package chap02.type.casting;

public class TypeCastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 3;
		long longValue = 55;
		
//		int intValue2 = intValue + longValue;
		long longValue2 = intValue + longValue;
		
		double doubleValue = 3.14;
		
//		int intValue3 = intValue + doubleValue;
		double doubleValue2 = intValue + doubleValue;
		
		// 정수형의 연산결과는 int (숏타입과 숏타입의 연산은 무조건 int)
		short shortValue1 = 3;
		short shortValue2 = 5;
		
//		short shortValue3 = shortValue1 + shortValue2;
		int intValue4 = shortValue1 + shortValue2;
	}

}
