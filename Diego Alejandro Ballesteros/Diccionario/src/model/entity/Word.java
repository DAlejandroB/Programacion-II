package model.entity;
import java.io.Serializable;
public class Word implements Serializable{
	private String lang;
	private String secLang;
	
	public Word(String lang, String secLang) {
		this.lang = lang;
		this.secLang = secLang;
	}
	public String getTranslation (String word) {
		if(word.equals(lang)) {
			return secLang;
		}else if(word.equals(secLang)) {
			return lang;
		}
		else 
			return null;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getSecLang() {
		return secLang;
	}
	public void setSecLang(String secLang) {
		this.secLang = secLang;
	}
}
