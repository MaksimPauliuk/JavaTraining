package by.jonline.module04.composition.task03;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String name;
	private City regionCenter;
	private List<District> districts;

	public Region() {
		name = "Новая область";
		regionCenter = new City("Областной центр", 0);
		districts = new ArrayList<District>();
		districts.add(new District());
	}

	public Region(String name, City regionCenter, List<District> districts) {
		this.name = name;
		this.regionCenter = regionCenter;
		this.districts = districts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(City regionCenter) {
		this.regionCenter = regionCenter;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[name=" + name + ", regionCenter=" + regionCenter + ", districts="
				+ districts + "]";
	}
}
