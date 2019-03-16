package file_processing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class writeReadFile {

	public static void main(String[] args) {

		int[] numbers = {2,3,5,7,11,13,17,19,23,29};
		File file = new File("10_prime_numbers.dat");
		
		System.out.println("Write:");
		writeFile(file, numbers);
		
		System.out.println();
		System.out.println("Read:");
		readFile(file);
		
	}
	
	private static void readFile(File file) {

		try {
			FileInputStream input = new FileInputStream(file);
			BufferedInputStream buffer = new BufferedInputStream(input);
			
			int n;
			do {
				n = buffer.read();
				if( n != -1)
					System.out.print(n+" ");
			} while(n != -1);
			buffer.close();
			
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.toString());
		} catch(EOFException eof) {
			System.out.println(eof.toString());
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}

	private static void writeFile(File file, int[] numbers) {
		
		try {
			FileOutputStream output = new FileOutputStream(file);
			BufferedOutputStream buffer = new BufferedOutputStream(output);
			
			for(int i=0; i<numbers.length; i++) {
				buffer.write(numbers[i]);
				System.out.print(numbers[i]+" ");
			}
			
			buffer.close();
			
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.toString());
		} catch(EOFException eof) {
			System.out.println(eof.toString());
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
		
	}
}
