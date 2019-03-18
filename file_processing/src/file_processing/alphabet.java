package file_processing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class alphabet {

	public static void main(String[] args) {
		
		File file = new File("alphabet.txt");
		writeFile(file);
		System.out.println("Read file: ");
		readFile(file);
	}
	
	private static void writeFile(File file) {
		try{
			FileWriter reader = new FileWriter(file);
			BufferedWriter buffer = new BufferedWriter(reader);
			
			for(int i = 65; i < 91; i++)
				buffer.write(i);
			buffer.close();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
	
	private static void readFile(File file) {
		try{
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			int n;
			do {
				n = buffer.read();
				if(n != -1)
					System.out.print( (char) n);
			}while(n != -1);
			
			buffer.close();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}


}
