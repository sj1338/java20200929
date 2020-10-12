package chap05;

public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 6, 7, 8};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------");
		for (int n : arr) {
			System.out.println(n);
		}
	}

}
