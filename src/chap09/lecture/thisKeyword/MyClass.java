package chap09.lecture.thisKeyword;

public class MyClass {
	
	
	
	class Nested {
		int field1;
		
		void method() {
			System.out.println(field1);
			System.out.println(this,field1);
			System.out.println(MyClass.this.field);
		}
	}
}
