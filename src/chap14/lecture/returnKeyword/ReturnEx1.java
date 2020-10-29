package chap14.lecture.returnKeyword;

public class ReturnEx1 {
	public static void main(String[] args) {
		MyInterface o1 = (x) -> {
			int y = x * 2;
			return y;
		};
		o1.method(3);
		
		MyInterface o2 = x -> {return x * 2;};
		o2.method(10);
		
		MyInterface o3 = a -> a * 2; // 컴파일러가 요게 리턴값이라는걸 알아서 해줌
		o3.method(20);
	}
}