package runner;
import controller.TranslatorController;

public class Runner {
	public static void main(String[]args) {
		TranslatorController tc = new TranslatorController();
		tc.start();
	}
}
