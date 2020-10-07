package chap04.textbook;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("----------");
		
		int a = 11;
		while (a <= 20) {
			System.out.println(a);
			a++;
		}
		System.out.println("----------");
		
		int b = 1;
		while (b <= 10) {
			System.out.println(b);
			b+=2;
		}
		System.out.println("----------");
		
		int c = 10;
		while (c >= 1) {
			System.out.println(c);
			c--;
		}
		System.out.println("----------");
		
		int d = 10;
		while(d >= 1) {
			System.out.println(d);
			d-=2;
		}
	}

}
