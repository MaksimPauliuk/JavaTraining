package by.jonline.module04.composition.task03;

public class City {
	private String name;
	private int population;

	public City() {
		name = "Новый город";
		population = 0;
	}

	public City(String name, int population) {
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[name=" + name + ", population=" + population + "]";
	}

}
