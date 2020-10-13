package chap06.lecture.method;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass o1 = new MyClass();
		o1.var1 = 3;
		o1.myMethod();
//		o1.yourMethod();
		
		MyClass o2 = new MyClass();
		o2.myMethod();
		
		o2.myMethod2(5);
		//파라미터를 정의해뒀으니 값을 넣어줘야함
		o2.myMethod2(7); // 둘다출력함
		
		o1.myMethod2(7);
		
		o1.myMethod3(1, 2);
	}

}
