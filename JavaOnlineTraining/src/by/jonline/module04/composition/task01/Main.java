package by.jonline.module04.composition.task01;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста
 */

public class Main {

	public static void main(String[] args) {
		Text text = new Text();
		
		text.setHeader("Заголовок");
		text.addSentence("Первое предложение.");
		text.addSentence(new Sentence("Второе предложение."));
		text.outInConsoleHeader();
		text.outInConsoleText();
		
		text.addSentence("Дополнили текст этим предложением.");
		text.addSentence("И последним предложением.");
		text.outInConsoleHeader();
		text.outInConsoleText();
	}
}
