package file_processing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class longText {

	public static void main(String[] args) {
		
		File file = new File("longText.txt");
		System.out.println("Plik \'"+file.getName()+"\':");
		readFile(file);

	}
	
	private static void readFile(File file) {
		StringBuilder sb = new StringBuilder();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			int n;
			do {
				n = br.read();
				if(n != -1)
					sb.append((char) n);
			}while(n != -1);
			
			System.out.print(sb);
		} catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		
	}
	

}
