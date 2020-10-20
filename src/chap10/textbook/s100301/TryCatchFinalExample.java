package chap10.textbook.s100301;

public class TryCatchFinalExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 존재안함");
		}
	}
}
