package by.jonline.module04.composition.task01;

import java.util.ArrayList;
import java.util.List;

/*
* Создать объект класса Текст, используя классы Предложение, Слово. 
* Методы: дополнить текст, вывести на консоль текст, заголовок текста
*/

public class Text {
	private Sentence header;
	private List<Sentence> text = new ArrayList<Sentence>();

	public Text() {
		header = new Sentence();
	}

	public Text(Sentence header, List<Sentence> text) {
		this.header = header;
		this.text = text;
	}

	public Sentence getHeader() {
		return header;
	}

	public void setHeader(Sentence header) {
		this.header = header;
	}
	
	public void setHeader(String header) {
		this.header = new Sentence(header);
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public void addSentence(Sentence s) {
		text.add(s);
	}
	
	public void addSentence(String s) {
		text.add(new Sentence(s));
	}
	
	public void outInConsoleHeader() {
		System.out.println(header);
		System.out.println("");
	}
	
	public void outInConsoleText() {
		for (Sentence t: text) {
			System.out.print(t);
		}
		System.out.println();
		System.out.println();
	}

}
