package chap05.exercises;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int[] scores = null;
		int studentNum = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum += scanner.nextInt();

			} else if (selectNo == 2) {
				System.out.println("점수입력>");
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores["+i+"]");
					scores[i] += scanner.nextInt();
				}

			} else if (selectNo == 3) {
				System.out.println("점수리스트");
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores["+ i +"]>" + scores[i]);
				}
				
			} else if (selectNo == 4) {
				System.out.println("분석");
				int max = 0;
				int sum = 0;
				for(int i = 0; i < studentNum; i++) {
					if(max <= scores[i]) {
						max = scores[i];
					}
				}
				for(int i = 0; i < scores.length; i++) {
						sum += scores[i]; 	
				}
				double avg =(double) sum / scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				
		
			} else if (selectNo == 5) {
				System.out.println("종료");
				run = false;

			}
		}

		System.out.println("프로그램 종료");
	}

}
