package by.jonline.module04.composition.task03;

public class RegionLogic {
	public double countArea(Region region) {
		double area = 0;
		for (District d : region.getDistricts()) {
			area += d.getArea();
		}
		return area;
	}
}
