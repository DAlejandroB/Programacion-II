package view;
import javax.swing.JOptionPane;

public class IoManager {
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public void showErrorMessage(String message) {
		JOptionPane.showInputDialog(null, message, "Error" , JOptionPane.ERROR_MESSAGE);
	}
	public int readInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	public String readString(String message) {
		return JOptionPane.showInputDialog(message);
	}
	public double readDouble(String message) {
		return Double.parseDouble(JOptionPane.showInputDialog(null,message));
	}
	public int readMenu(String menu) {
		return this.readInt(menu);
	}
	public boolean showConfirmDialog(String message) {
		int option = JOptionPane.showConfirmDialog(null, message);
		if(option == 1)
			return false;
		else 
			return true;
	}
}
