package uniandes.cupi2.mundial.interfaz.consola;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IoManager {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public int readInt() {
		int retorno = 0;
		try {
			retorno = Integer.parseInt(br.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
		return retorno;
	}
	public int readInt(String message) {
		int retorno = 0;
		println(message);
		try {
			retorno = Integer.parseInt(br.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
		return retorno;
	}
	public double readDouble() {
		double retorno = 0;
		try{
			retorno = Double.parseDouble(br.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
		return retorno;
	}
	public double readDouble(String message) {
		double retorno = 0;
		println(message);
		try{
			retorno = Double.parseDouble(br.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
		return retorno;
	}
	public String readString() {
		String retorno = "";
		try {
			retorno = br.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return retorno;
	}
	public String readString(String message) {
		String retorno  = "";
		println(message);
		try {
			retorno = br.readLine();
		}catch(IOException e) {
			print(e.getMessage());
		}
		return retorno;
	}
	public void clearConsole() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.flush();
	}
	public void println(String string) {
		System.out.println(string);
	}
	public void print(String string) {
		System.out.print(string);
	}
}
