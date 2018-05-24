package persistence;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ConnectionReader {
	
	public static void createFile() {
		URL obj;
		FileWriter fw;
		BufferedWriter bw;
		try {
			obj = new URL("http://api.tvmaze.com/singlesearch/shows?q=rick-&-morty&embed=episodes");
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			File file = new File("data.json");
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			int responseCode = con.getResponseCode();
			System.out.println("Response code: " + responseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while((inputLine =in.readLine()) != null) {
				bw.write(inputLine);
			}
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}