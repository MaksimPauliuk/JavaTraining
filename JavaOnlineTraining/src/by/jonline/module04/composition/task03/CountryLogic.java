package by.jonline.module04.composition.task03;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class CountryLogic {
	public Country GreateDefaultCountry() {
		List<Region> region = new ArrayList<Region>();

		List<District> district = new ArrayList<District>();
		district.add(new District("Бресткий", 1544, new City("Брест", 343985)));
		district.add(new District("Пинский", 3252, new City("Пинск", 138202)));
		region.add(new Region("Бресткая", new City("Брест", 343985), district));

		district = new ArrayList<District>();
		district.add(new District("Витебский", 2705, new City("Витебск", 362466)));
		district.add(new District("Полоцкий", 2110, new City("Полоцк", 80795)));
		region.add(new Region("Витебская", new City("Витебск", 362466), district));

		district = new ArrayList<District>();
		district.add(new District("Гомельский", 1951, new City("Гомель", 508839)));
		district.add(new District("Жлобинский", 2110, new City("Жлобин", 76078)));
		region.add(new Region("Гомельская", new City("Гомель", 508839), district));
		
		region.add(new Region());

		Country country = new Country("Беларусь", new City("Минск", 1975000), region);
		return country;
	}

	public double countArea(Country country) {
		double countryArea = 0;
		RegionLogic rl = new RegionLogic();

		for (Region r : country.getRegions()) {
			countryArea += rl.countArea(r);
		}
		return countryArea;
	}

	public int countRegions(Country country) {
		int countOfRegions = 0;

		for (@SuppressWarnings("unused")
		     Region r : country.getRegions()) {
			countOfRegions++;
		}
		return countOfRegions;
	}
}
