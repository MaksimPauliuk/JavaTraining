package by.jonline.module04.composition.task03;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class CountryView {
	private CountryLogic cl = new CountryLogic();
	
	public void showCountryInfo(Country country) {
		System.out.println("Страна: " + country.getName());
		System.out.println("Cтолица: " + country.getCapital().getName());
		System.out.println("Площадь: " + cl.countArea(country));
		System.out.println("Количество областей: " + cl.countRegions(country));
		for(Region rg: country.getRegions()) {
			System.out.println(rg);
		}
		System.out.println("Областные центры: ");
		for(Region rg: country.getRegions()) {
			System.out.print(rg.getRegionCenter().getName() + " ");
		}
		System.out.println();
	}
}
