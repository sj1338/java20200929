package chap10.textbook.exercises.p6;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = { "10", "20", "3b" };
		int value = 0;
		for (int i = 0; i <= 3; i++) {
			try {
				value = Integer.parseInt(strArray[i]); // 안맞으면 실행하지 않고 이전 값을 가지고있음
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
			}
		}

	}
}






