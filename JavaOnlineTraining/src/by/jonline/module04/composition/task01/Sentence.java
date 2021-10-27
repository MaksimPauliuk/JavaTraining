package by.jonline.module04.composition.task01;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	private List<Word> sentence = new ArrayList<Word>();

	public Sentence() {

	}
	
	public Sentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public Sentence(String sentence) {
		for(String s:sentence.split(" ")) {
			this.sentence.add(new Word(s));
		}
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}
	
	public void addWord (Word word) {
		sentence.add(word);
	}
	
	public void changeSentence(String sentence) {
		this.sentence.clear();
		for(String s:sentence.split(" ")) {
			this.sentence.add(new Word(s));
		}
	}

	@Override
	public String toString() {
		String tempSentence = "";
		for (Word w:sentence) {
			tempSentence += w.getWord() + " ";	
		}
		return tempSentence;
	}

}
