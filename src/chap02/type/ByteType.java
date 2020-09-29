package chap02.type;

public class ByteType {
	public static void main(String[] args) {
		// byte : 정수형
		// 크기 : 1byte (8bit)
		
		
		
		// -128 : 1000 0000
	
		//    : 
		// -3 : 1111 1101
		// -2 : 1111 1110
		// -1 : 1111 1111
		
		// +1
		
		//     1 0000 0000 8개의 비트로만해야되니까 1이 버려져서 0이됨
		
		// 0 : 0000 0000
		// 1 : 0000 0001
		// 2 : 0000 0010
		//   :
		// 127  : 0111 1111
		
		// +1
		
		// -128 : 1000 0000
		
//		최소값 -128
//		최댓값 127
		
//		0 으로시작하면 0또는 양수
//		1 로시작하면 음수
		
		byte byteValue;
		
		byteValue = 0;
		System.out.println(byteValue);
		
		byteValue = 127;
		System.out.println(byteValue);
		
//		byteValue = 128;
		
		byteValue++;
		System.out.println(byteValue);
		
	}
}
