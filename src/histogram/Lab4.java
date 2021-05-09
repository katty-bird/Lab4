package histogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Lab4 {
	public static void main (String[] args) throws Exception  {
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		int ch = br.read(); //reads the symbol
		int i = 1; // counts the number of the next character 
		try {
			while(ch !=-1){ // we get '-1' at the end of the file
				  if (!List.of('\s', '\r', '\n').contains((char)ch)) {					  
				     System.out.println(i + " character: " + (char) ch);
						 i +=1;	  
				  }
				  ch = br.read(); //reads the symbol
				}
		} catch (IOException e) {
			System.out.println(e);
			} finally {
				try {
					if (fr != null) {
						fr.close(); //closes reading 
					}
				} catch (IOException e) {
					System.out.println(e);
				}
			}
	}
}
