package chap04.textbook;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
	
	// 랜덤은 0과 1사이값
	// 0 <= random < 1
	//0*6 <= random *6 < 1*6
	// 즉 0에서 5.99999까지 나오는데 int라 5.9999 = 5
	
	// 0, 1, 2, 3, 4, 5
	// +1을 해서 주사위 만듬
	
}
