package file_processing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class primeNumbers {

	public static void main(String[] args) {

		int[] numbers = {2,3,5,7,11,13,17,19,23,29};
		File file = new File("10_prime_numbers.dat");
		
		System.out.println("Write prime numbers:");
		writeFile(file, numbers);
		
		System.out.println();
		System.out.println("Read prime numbers:");
		readFile(file);
		
	}
	
	private static void readFile(File file) {

		try (BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(file))){
			
			int n;
			do {
				n = buffer.read();
				if( n != -1)
					System.out.print(n+" ");
			} while(n != -1);
			
		}
		catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}

	private static void writeFile(File file, int[] numbers) {
		
		try (BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream(file))){
			
			for(int i=0; i<numbers.length; i++) {
				buffer.write((char) numbers[i]);
				System.out.print(numbers[i]+" ");
			}
			
			
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
		
	}
}
