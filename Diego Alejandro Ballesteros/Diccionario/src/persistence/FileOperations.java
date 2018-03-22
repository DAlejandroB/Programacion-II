package persistence;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;

public class FileOperations {
	
	public ArrayList<String> loadTextFile (String file) {
		ArrayList<String> loadingList = new ArrayList<String>();
		FileReader fr;
		BufferedReader br;
		String s;
		try{
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			s = br.readLine();
			do {
				loadingList.add(s);
				s = br.readLine();
			}while(s != null);
			fr.close();
			return loadingList;
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void writeTextFile(String dir, String text) {
		try{
			FileWriter fw = new FileWriter(dir);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(text);
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
