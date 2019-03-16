package file_processing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class randomNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in a range of numbers (between 0-255) that should be written into a file.");
		
		System.out.print("Start: ");
		int start = scanner.nextInt();
		
		System.out.print("End: ");
		int end = scanner.nextInt();
		scanner.close();
		
		File file = new File("random_numbers.dat");
		
		System.out.println("Write to file: ");
		writeToFile(file, start, end);
		System.out.println();
		System.out.println("Read from file: ");
		readFile(file);
	}
	
	private static void writeToFile(File file, int start, int end) {
		try{
			FileOutputStream input = new FileOutputStream(file);
			BufferedOutputStream buffer = new BufferedOutputStream(input);
			DataOutputStream stream = new DataOutputStream(buffer);
			
			for(int i = start; i <= end; i++) {
				stream.writeInt(i);
				System.out.print(i+" ");
			}
			stream.close();
			
		} catch(IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
	
	private static void readFile(File file) {
		try{
			FileInputStream input = new FileInputStream(file);
			BufferedInputStream buffer = new BufferedInputStream(input);
			DataInputStream stream = new DataInputStream(buffer);
			
			int n;
			do {
				n = stream.readInt();
				//if(n != null)
					System.out.print(n+" ");
			}while(n != -1);
			stream.close();
			
		} catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}

}
