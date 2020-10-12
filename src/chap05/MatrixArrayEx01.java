package chap05;

public class MatrixArrayEx01 {

	public static void main(String[] args) {
		// 행렬을 배열로 표시하는 법
		
		int[][] matrix = new int[3][2];
		// 인티저 배열을 저장 할 수 있는 배열
		
		int[] arr = new int[3];
		//인티저를 저장 할 수 있는 배열
		System.out.println(arr.length);
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
//		System.out.println(matrix[3].length); 없음
		
		arr[0] = 99;
		arr[1] = 88;
		arr[2] = 77;
		
		matrix[0][0] = 9;
		matrix[2][0] = 1;
		
//		matrix[2][2] = 2; 없음
//		matrix[3][0] = 3; 없음
		
	}

}
