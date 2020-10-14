package chap06.textbook.s061401.copy;

public class Car {
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setSpeed(boolean speed) {
		this.stop = stop;
		this.speed = 0;
	}
}
