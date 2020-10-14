package chap06.accessModifier.other;

import chap06.accessModifier.MyClass;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		
		System.out.println(o1.var1);
//		System.out.println(o1.var2); 안됨
//		System.out.println(o1.var3);
	}
}
