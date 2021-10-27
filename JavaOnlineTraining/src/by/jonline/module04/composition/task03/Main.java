package by.jonline.module04.composition.task03;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Main {

	public static void main(String[] args) {
		Country country;
		CountryView cv = new CountryView();
		CountryLogic cl = new CountryLogic();
		
		country = cl.GreateDefaultCountry();
		
		cv.showCountryInfo(country);

	}

}
