package chap04.exercises;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				num1 = x;
				num2 = y;

				if ((x * 4) + (y * 5) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}

		}
	}
}
