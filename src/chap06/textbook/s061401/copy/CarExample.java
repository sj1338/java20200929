package chap06.textbook.s061401.copy;

public class CarExample {
	public static void main(String[] args) {
		CarExample myCar = new CarExample();
		
		myCar.setSpeed(-50);
		
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
	}
}
