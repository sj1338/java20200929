




package chap04.exercises;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("입력");
//		String line = scanner.nextLine();
//		
//		// 컨트롤 쉬프트 o
//		
//		System.out.println("출력");
//		System.out.println(line);
//		
//		int num = Integer.valueOf(line);
//		int i = num * 2;
//		System.out.println(i);

		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.println("선택>");

			// 작성 위치

			int num = scanner.nextInt();
			// 예금, 적금 시 잔고 함께 표시
			
			if (num == 1) {
				System.out.println("예금액>");
				balance += scanner.nextInt();
				System.out.println("잔고>");
				System.out.println(balance);
				
			} else if (num == 2) {
				System.out.println("출금액>");
				balance -= scanner.nextInt();
				System.out.println("잔고>");
				System.out.println(balance);

			} else if (num == 3) {
				System.out.println("잔고>");
				System.out.println(balance);

			} else if (num == 4) {
				run = false;
			}

		}

		System.out.println("프로그램 종료");
	}
}
