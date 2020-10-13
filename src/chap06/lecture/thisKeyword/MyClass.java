package chap06.lecture.thisKeyword;

public class MyClass {
	int var;
	
	MyClass() {
		
	}
	
	MyClass(int var) {
		this.var = var;
	}
	
	void method1() {
		int var = 5;
		System.out.println(this.var); //맨위필드
		System.out.println(var); //5
	}
	void method2() {
		method1();
	}
}
