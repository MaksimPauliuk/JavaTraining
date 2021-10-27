package by.jonline.module04.simple_class.task09;

import java.util.ArrayList;
import java.util.List;

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

public class Library {
	private List<Book> books;

	Library() {
		books = new ArrayList<Book>();
	}

	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void addBook(Book b) {
		books.add(b);
	}

	public void outInConsoleBooks() {
		for (Book b : books) {
			System.out.println(b);
		}
	}

	public void showBooksByAuthors(String authors) {
		for (Book b : books) {
			if (b.getAutors().contains(authors)) {
				System.out.println(b);
			}
		}
	}
	
	public void showBooksByPublisher(String publisher) {
		for (Book b : books) {
			if (b.getPublisher().equalsIgnoreCase(publisher)) {
				System.out.println(b);
			}
		}
	}
	
	public void showBooksAfterYear(int year) {
		for (Book b : books) {
			if (b.getYear() > year) {
				System.out.println(b);
			}
		}
	}
}
