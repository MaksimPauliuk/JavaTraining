package by.jonline.module04.composition.task02;

public class Engine {
	private double volume;
	private int power;

	public Engine() {
		volume = 2.0;
		power = 140;
	}

	public Engine(double volume, int power) {
		this.volume = volume;
		this.power = power;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[volume=" + volume + ", power=" + power + "]";
	}

}
