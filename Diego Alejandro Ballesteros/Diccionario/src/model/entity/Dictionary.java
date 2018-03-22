package model.entity;
import java.util.ArrayList;
import java.io.Serializable;

public class Dictionary implements Serializable{

	private String mainLang;
	private String secLang;
	private ArrayList<Word> words = new ArrayList<Word>();
	
	public Dictionary(String name, String secLan) {
		this.mainLang = name;
		this.secLang = secLan;
	}
	public ArrayList<Word> getWords(){
		return this.words;
	}
	public int getSize() {
		return words.size();
	}
	public String getName() {
		return mainLang;
	}

	public void setName(String name) {
		this.mainLang = name;
	}
	public void addWord(String word, String transWord) {
		Word w = new Word(transWord, word);
		words.add(w);
	}
	public String getSecLan() {
		return this.secLang;
	}
	public String getTWord(String s) {
		String r = "No se ha encontrado traduccion de la palabra";
		for(Word w: words) {
			if(w.getLang().equals(s)) {
				r = w.getTranslation(s);
			}
		}
		return r;
	}
}
