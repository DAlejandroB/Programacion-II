package model.dao;
import model.entity.Dictionary;
import persistence.ObjectFileOperations;

public class Translator {
	public static int LANGUAGE_NUM = 2;
	private Dictionary[] dicList = new Dictionary[LANGUAGE_NUM];
	
	public Translator() {
		initLang();
	}
	public Dictionary[] getLangList() {
		return dicList;
	}
	public void setLangList(Dictionary[] langList) {
		this.dicList = langList;
	}
	private void initLang() {
		Dictionary l;
		l = new Dictionary("Spanish","English");
		dicList[0] = l;
		l = new Dictionary("Spanish","French");
		dicList[1] = l;
	}
	public void addEnglishWord(String enWord,String spWord) {
		dicList[0].addWord(spWord, enWord);
	}
	public void addFrenchWord(String frWord, String spWord) {
		dicList[1].addWord(spWord, frWord);
	}
	public String getFrenchWord(String spWord) {
		return dicList[1].getTWord(spWord);
	}
	public String getEnglishWord(String spWord) {
		return dicList[0].getTWord(spWord);
	}
	public void save() {
		ObjectFileOperations.saveBinFile(dicList, "data.bin",false);
	}
	public Dictionary[] load() {
		return dicList = (Dictionary[])ObjectFileOperations.loadBinFile("data.bin");
	}
}
