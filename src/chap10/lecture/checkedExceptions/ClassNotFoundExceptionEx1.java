package chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		
		System.out.println("프로그램 실행 1");
		try {
			System.out.println("프로그램 실행 tr1");
		Class.forName("java.lang.String");
		System.out.println("프로그램 실행 tr2"
				+ "");
		} catch (ClassNotFoundException e) {
			System.out.println("익셉션 발생!");
		} finally {
			System.out.println("무조건 살행!");
		}
		
		System.out.println("프로그램 실행 2");
	}
}
