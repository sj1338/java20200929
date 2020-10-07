package chap04.exercises;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 3;
		
		while(i<=100) {
			sum += i;
			i+=3;
		}
		System.out.println("3의 배수의 합 : " + sum);
	}

}
