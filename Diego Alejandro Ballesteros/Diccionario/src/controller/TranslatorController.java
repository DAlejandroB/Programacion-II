package controller;
import model.dao.Translator;
import view.IoManager;
public class TranslatorController {
	Translator translator = new Translator();
	IoManager io = new IoManager();
	public void start() {
		translator.setLangList(translator.load());
		
		this.menu();
	}
	public void menu() {
		int option = -1;
		do{
			option = io.readInt("1-Traducir inglés/español\n2-Traducir francés/español\n3-Agregar palabra en ingles\n4-Agregar palabra en francés\n5-Ver el número de palabras\n0-Salir.");
			switch(option) {
			case 1:
				translateEnglish();
				break;
			case 2:
				translateFrench();
				break;
			case 3:
				addEnglishWord();
				break;
			case 4:
				addFrenchWord();
				break;
			case 5:countWords();
				break;
			}
			translator.save();
		}while(option != 0);
	}
	private void translateEnglish() {
		String sp = io.readString("Ingrese la palabra en español");
		io.showMessage(translator.getEnglishWord(sp));
	}
	private void translateFrench() {
		String sp = io.readString("Ingrese la palabra en español");
		io.showMessage(translator.getFrenchWord(sp));
	}
	private void addEnglishWord() {
		translator.addEnglishWord(io.readString("Ingrese la palabra en español"), io.readString("Ingrese la palabra en inglés"));
	}
	private void addFrenchWord() {
		translator.addFrenchWord(io.readString("Ingrese la palabra en español"), io.readString("Ingrese la palabra en frances"));
	}
	private void countWords() {
		int lan = io.readInt("1-Diccionario Español/Inglés \n2-Diccionario Español/Francés");
		if(lan == 1)
			io.showMessage("El diccionario contiene " + translator.getLangList()[0].getSize() + " palabras");
		if(lan == 2) 
			io.showMessage("El diccionario contiene " + translator.getLangList()[1].getSize() + " palabras");
	}
}
