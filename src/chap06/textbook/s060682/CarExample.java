package chap06.textbook.s060682;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();

		myCar.setGas(5); // Car의 setGas() 메소드 호출

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다");
		} else {
			System.out.println("가스를 주입하세요");
		}
	}
}
