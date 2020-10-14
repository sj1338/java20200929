package chap06.lecture.finalKeyword;

public class MyApp {
	public static void main(String[] args) {
		int i;
		final int j;
		
		i = 30;
		i = 40;
		
		j = 20; // 한번만 할당가능, 변하지않으니 상수
//		j = 10;
	
		
		MyClass o1 = new MyClass();
		o1.field1 = 3;
//		o1.field2 = 4;
	}
}
