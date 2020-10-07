package chap04.exercises;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		while (true) {
			int A = (int) (Math.random() * 6) + 1;
			int B = (int) (Math.random() * 6) + 1;
			System.out.println("(" + A + "," + B + ")");
			sum = A + B;
			if (A + B == 5) {
				break;
			}
		}
		System.out.println("주사위 끝");
	}
}
