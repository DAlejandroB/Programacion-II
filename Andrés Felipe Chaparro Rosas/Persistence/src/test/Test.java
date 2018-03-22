package test;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File file = new File("D:persistence");
		System.out.println("Nombre del archivo : "+file.getName());
		System.out.println("Tamaño del archivo : "+file.length());
		System.out.println("Camino del archivo : "+file.getPath());
		System.out.println("Existe : "+(file.exists()?"Si":"No"));
		System.out.println("Es un archivo : "+(file.isFile()?"Si":"No"));
		System.out.println("Esta oculto : "+(file.isHidden()?"Si":"No"));
		System.out.println("Es directorio : "+(file.isDirectory()?"Si":"No"));
		System.out.println("Espacio libre : "+file.getFreeSpace());
		System.out.println("*****************************");
		for (File f : file.listFiles()) {
			System.out.println(f.getName());
		}
	}
}
