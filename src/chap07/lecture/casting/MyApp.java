package chap07.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		SuperClass[] arr = new SuperClass[3];
		arr[0] = new SubClass();
		method3(new SubClass());
	}
	
	public static void method3(SupperClass s) {
		s.method1();
	}
}
