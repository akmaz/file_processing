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
		try(BufferedWriter buffer = new BufferedWriter(new FileWriter(file))){
			
			for(int i = 65; i < 91; i++)
				buffer.write(i);
			
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
	
	private static void readFile(File file) {
		try(BufferedReader buffer = new BufferedReader(new FileReader(file))){
			int n;
			do {
				n = buffer.read();
				if(n != -1)
					System.out.print( (char) n);
			}while(n != -1);
			
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}


}
