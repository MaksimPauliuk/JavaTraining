package by.jonline.module04.simple_class.task09;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить 
 * конструкторы, set- и get- методы и метод  toString(). Создать второй класс, 
 * агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль. 
 * 
Book: id, название, автор(ы), издательство, год издания, количество страниц, 
цена, тип переплета. Найти и вывести: 
a) список книг заданного автора; 
b) список книг, выпущенных заданным издательством; 
c) список книг, выпущенных после заданного года.
 */

public class Book {
	private int id;
	private String title;
	private String autors;
	private String publisher;
	private int year;
	private int pages;
	private double price;
	private String bindingType;

	public Book() {

	}

	public Book(int id, String title, String autors, String publisher, int year, int pages, double price,
			String bindingType) {
		super();
		this.id = id;
		this.title = title;
		this.autors = autors;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutors() {
		return autors;
	}

	public void setAutors(String autors) {
		this.autors = autors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[id=" + id + ", title=" + title + ", autors=" + autors + ", publisher="
				+ publisher + ", year=" + year + ", pages=" + pages + ", price=" + price + ", bindingType="
				+ bindingType + "]";
	}
}
