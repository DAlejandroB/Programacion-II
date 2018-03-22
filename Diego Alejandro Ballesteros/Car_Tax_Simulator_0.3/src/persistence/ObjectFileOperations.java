package persistence;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ObjectFileOperations {
	public static void saveBinFile(Object obj,String dir) {
		File file;
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			file = new File(dir);
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			fos.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Object loadBinFile(String dir) {
		File file;
		FileInputStream fis;
		ObjectInputStream ois;
		Object ob = null;
		try {
			file = new File(dir);
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			ob = ois.readObject();
			fis.close();
			ois.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return ob;
	}
	private static void createFile(String dir) {
		File file;
		FileOutputStream fos;
		try {
			file = new File(dir);
			fos = new FileOutputStream(file);
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
