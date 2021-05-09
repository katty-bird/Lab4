package histogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//import java.util.List;

//public class Lab4 {
//	public static void main (String[] args) throws Exception  {
//		FileReader fr = new FileReader("abc.txt");
//		BufferedReader br = new BufferedReader(fr);
//		File output = new File("/Users/katya/eclipse-workspace/lab4/output.txt");
//		FileWriter fw = new FileWriter(output);
//		output.createNewFile();
//
//		int ch = br.read(); //reads the symbol
//		int i = 1; // counts the number of the next character 
//		try {
//			while(ch !=-1){ // we get '-1' at the end of the file
//				  if (!List.of('\s', '\r', '\n').contains((char)ch)) {					  
//				     System.out.println(i + " character: " + (char) ch);
//						 i +=1;	  
//				  }
//				  ch = br.read(); //reads the symbol
//				}
//		} catch (IOException e) {
//			System.out.println(e);
//			} finally {
//				try {
//					if (fr != null) {
//						fr.close(); //closes reading 
//					}
//				} catch (IOException e) {
//					System.out.println(e);
//				}
//			}
//	}
//}

public class Lab4 {

	private static int[] characters;
	private static FileWriter fw;
	private static BufferedReader br;
	private static File output;
	private static FileReader fr;
	private static File inputFile;

	public static void main(String[] args) throws IOException {
		inputFile = new File("alice30.txt");
		fr = new FileReader(inputFile);
		br = new BufferedReader(fr);
		output = new File("/Users/katya/eclipse-workspace/lab4/output.txt");
		fw = new FileWriter(output);
		output.createNewFile();
		characters = new int[27];

		int i;
// Nr 1 und Nr 2 
		while ((i = br.read()) != -1) {
			if (i > 64 && i < 91) {
				i += 32;
			}

			if (i == 10 || i == 13) {
				br.skip(1);

			} else {
				if (i > 95 && i < 123) {
//				Für Nr 2 ein kommentieren						
					characters[i - 96] = characters[i - 96] + 1;
// 				Nr 2 beide Codes aus kommentieren und das drawHistogram ein kommentieren und alles was dann als nicht benutzt angezeigt wird auch einkommentieren					
//				System.out.print((char) i);
//					fw.write("" + 10);					
				} else {
					br.skip(1);
				}
				characters[0] = characters[0] + 1;
			}
		}
		drawHistogram();
	}
// Nr 4 Das Histogramm mit/ Nr3 der Anzahl der Zahlen
	public static void drawHistogram() throws IOException {
//      Nr 4 / für nr 4 aus kommentieren 		
//		String star = "*";
		String st = "";
		for (int z : characters) {
//			Nr 4 /für Nr 4 aus kommentieren 
//			st += star.repeat(z / 10) + "\r\n";
//			Nr 3 /für Nr 4 ein kommentieren
			st += z + "\r\n";
		}
		fw.write(st);
		fw.flush();
		fw.close();
	}
}
