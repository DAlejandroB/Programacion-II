package controller;
import model.dao.Calculator;
import java.util.Locale;
import java.util.ResourceBundle;
import view.IoManager;

public class CalculatorController {

	private Calculator op = new Calculator();
	private IoManager io = new IoManager();
	private int lenguageOp; 
	
	public void start() {
		lenguageOp = io.readInt("Select a language / Seleccione un idioma \n1-Español\n2-English");
		op.load();
		this.menu();
	}
	private void menu () {
		int option = 0;
			do {
				option=io.readMenu(getBundle().getString("texto_menu"));
				switch(option) {
				case 1:this.calculateTax();
					break;
				case 2:this.addBrand();
					break;
				case 3:this.addLine();
					break;
				case 4:this.addModel();
					break;
				case 5:this.showBrands();
					break;
				}
				op.save();
		}
		while(option != 0);
	}
	private void showBrands() {
		io.showMessage(op.getBrandString());		
	}
	private void calculateTax() {
		double brute = op.calculateBrute(io.readString(getBundle().getString("texto_obtenerMarca")), io.readString(getBundle().getString("texto_obtenerLinea")), io.readString(getBundle().getString("texto_obtenerModelo")), io.showConfirmDialog(getBundle().getString("texto_pp")), io.showConfirmDialog(getBundle().getString("texto_pub")), io.showConfirmDialog(getBundle().getString("texto_mov")));
		io.showMessage(getBundle().getString("texto_mostrarImpuesto") + brute + " COP");
	}
	private void addBrand() {
		op.addNewBrand(io.readString(getBundle().getString("texto_obtenerMarca")));
	}
	private void addLine() {
		op.addLine(io.readString(getBundle().getString("texto_obtenerMarca")), io.readString(getBundle().getString("texto_obtenerLinea")));
	}
	private void addModel() {
		op.addModel(io.readString(getBundle().getString("texto_obtenerMarca")), io.readString(getBundle().getString("texto_obtenerLinea")), io.readString(getBundle().getString("texto_obtenerModelo")), io.readInt(getBundle().getString("texto_obtenerPrecio")));
	}
	private ResourceBundle getBundle() {
		if(lenguageOp == 2)
		return ResourceBundle.getBundle("view/labels",Locale.ENGLISH);
		else
		return ResourceBundle.getBundle("view/labels");
	}
}
