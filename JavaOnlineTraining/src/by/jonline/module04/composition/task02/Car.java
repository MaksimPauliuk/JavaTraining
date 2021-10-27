package by.jonline.module04.composition.task02;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля. 
 */

public class Car {
	private String brand;
	private double tankVolume;
	private double levelFuel;
	private double fuelConsumption;
	private Engine engine;
	private List<Wheel> wheels;

	public Car() {
		brand = "Renault";
		tankVolume = 60.0;
		levelFuel = 60.0;
		fuelConsumption = 8.0;
		wheels = new ArrayList<Wheel>();
		engine = new Engine();
		wheels.add(new Wheel("left-front", "4x100", 16, "205/55"));
		wheels.add(new Wheel("right-front", "4x100", 16, "205/55"));
		wheels.add(new Wheel("left-back", "4x100", 16, "205/55"));
		wheels.add(new Wheel("left-back", "4x100", 16, "205/55"));
	}

	public Car(String brand, double tankVolume, double levelFuel, double fuelConsumption, Engine engine,
			List<Wheel> wheels) {
		this.brand = brand;
		if (tankVolume >= 1) {
			this.tankVolume = tankVolume;
		} else
			this.tankVolume = 1;
		refuel(levelFuel);
		if (fuelConsumption >= 1.0) {
			this.fuelConsumption = fuelConsumption;
		} else
			this.fuelConsumption = 1.0;
		this.engine = engine;
		this.wheels = wheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getTankVolume() {
		return tankVolume;
	}

	public void setTankVolume(double tankVolume) {
		if (tankVolume >= 1.0) {
			this.tankVolume = tankVolume;
		} else
			this.tankVolume = 1.0;
	}

	public double getLevelFuel() {
		return levelFuel;
	}

	public void setLevelFuel(double levelFuel) {
		refuel(levelFuel);
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		if (fuelConsumption >= 1.0) {
			this.fuelConsumption = fuelConsumption;
		} else
			this.fuelConsumption = 1.0;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public void refuel(double litersOfFuel) {
		if (litersOfFuel <= 0) {
			System.out.println("Нельзя заправить авто на значение <= 0!");
		} else if (litersOfFuel <= tankVolume - levelFuel) {
			levelFuel += litersOfFuel;
			System.out.printf("Бак заправлен. Сейчас в баке %4.2f л.%n", levelFuel);
		} else {
			levelFuel = tankVolume;
			System.out.println("Все в бак не влезло, бак заправлен до полного.");
		}
	}

	public void drive(double distance) {
		if (distance * fuelConsumption * 0.01 > levelFuel) {
			System.out.println("Не хватит топлива! Сначала заправьтесь.");
		} else {
			levelFuel -= distance * fuelConsumption * 0.01;
			System.out.printf("Поездка закончена. Осталось в баке %4.2f л.%n", levelFuel);
		}
	}

	public void changeWheel(Wheel newWheel) {
		boolean trigger = false;
		for (Wheel w : wheels) {
			if (w.getSide().equalsIgnoreCase(newWheel.getSide())) {
				trigger = true;
				if (w.getPsd().equalsIgnoreCase(newWheel.getPsd())) {
					w = newWheel;
					System.out.println("Колесо заменено");
				} else {
					System.out.println("Невозможно заменить колесо! не совпадает PSD.");
				}
				break;
			}
		}
		if(!trigger) {
			System.out.println("Указана неверная сторона колеса!");
		}
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "[brand=" + brand + ", tankVolume=" + tankVolume + ", levelFuel="
				+ levelFuel + ", fuelConsumption=" + fuelConsumption + ", engine=" + engine + ", wheels=" + wheels
				+ "]";
	}

}
