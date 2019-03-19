package file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class longText {

	public static void main(String[] args) {
		
		File file = new File("longText.txt");
		System.out.println("Plik \'"+file.getName()+"\':");
		readFile(file);

	}
	
	private static void readFile(File file) {
		StringBuilder sb = new StringBuilder();
		
		try(Scanner scanner = new Scanner(file)){
			String line;
			while(scanner.hasNext()){
				line = scanner.nextLine();
				sb.append(line);
				if(line.isEmpty())
					sb.append('\n');
				
			}
		System.out.print(sb);
		} catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.toString());
		}
	}
	

}
