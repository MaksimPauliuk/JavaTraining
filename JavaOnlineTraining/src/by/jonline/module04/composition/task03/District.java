package by.jonline.module04.composition.task03;

public class District {
	private String name;
	private double area;
	private City districtCenter;

	public District() {
		name = "Новый район";
		area = 1;
		districtCenter = new City("Районный центр", 0);
	}

	public District(String name, double area, City districtCenter) {
		this.name = name;
		this.area = area;
		this.districtCenter = districtCenter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public City getDistrictCenter() {
		return districtCenter;
	}

	public void setDistrictCenter(City districtCenter) {
		this.districtCenter = districtCenter;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[name=" + name + ", area=" + area + ", districtCenter=" + districtCenter
				+ "]";
	}
}
