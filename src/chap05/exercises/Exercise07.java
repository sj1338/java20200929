package chap05.exercises;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;  // Integer.MIN_VALUE;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			
			max = (max > array[i]) ? max : array[i];
			
//			if (array[i] > max)
//				max = array[i];

		}
		System.out.println("max: " + max);
		
	}
}
