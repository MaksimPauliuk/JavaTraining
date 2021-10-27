package by.jonline.module04.composition.task03;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String name;
	private City capital;
	private List<Region> regions;

	public Country() {
		name = "Новое государство";
		capital = new City("Столица государства", 1);
		regions = new ArrayList<Region>();
		regions.add(new Region());
	}

	public Country(String name, City capital, List<Region> regions) {
		this.name = name;
		this.capital = capital;
		this.regions = regions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[name=" + name + ", capital=" + capital + ", regions=" + regions + "]";
	}

}
