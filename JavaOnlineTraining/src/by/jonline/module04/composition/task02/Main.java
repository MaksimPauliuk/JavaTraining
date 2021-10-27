package by.jonline.module04.composition.task02;

/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля. 
 */

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("Марка авто: " + car.getBrand());
		System.out.println("Объем бака: " + car.getTankVolume());
		System.out.println("Топлива в баке: " + car.getLevelFuel());
		System.out.println("Расход топлива: " + car.getFuelConsumption());
		System.out.println("Двигатель: " + car.getEngine());
		System.out.println("Установлены колеса: ");
		for (Wheel w:car.getWheels()) {
			System.out.println(w);
		}
		
		car.drive(100);
		car.changeWheel(new Wheel("left-front", "4x113", 16, "205/55"));
		car.changeWheel(new Wheel("front", "4x113", 16, "205/55"));
		car.changeWheel(new Wheel("left-front", "4x100", 16, "205/55"));
		car.drive(500);
		car.drive(500);
		car.refuel(-50);
		car.refuel(10);
		car.refuel(100);

	}

}
