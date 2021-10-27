package by.jonline.module04.composition.task05;

public class Voucher {
	private Type type;
	private String place;
	private String hotel;
	private int days;
	private Transport transport;
	private Food food;
	private int price;

	public Voucher() {
		type = Type.CRUISE;
		place = "Алания";
		hotel = "Acar 4*";
		days = 7;
		transport = Transport.BUS;
		food = Food.FBP;
		price = 700;
	}

	public Voucher(Type type, String place, String hotel, int days, Transport transport, Food food, int price) {
		this.type = type;
		this.place = place;
		this.hotel = hotel;
		this.days = days;
		this.transport = transport;
		this.food = food;
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[type=" + type + ", place=" + place + ", hotel=" + hotel + ", days=" + days
				+ ", transport=" + transport + ", food=" + food + ", price=" + price + "]";
	}

}
