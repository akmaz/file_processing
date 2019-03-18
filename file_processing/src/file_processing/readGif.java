package file_processing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class readGif {

	public static void main(String[] args) {
		File fileIn = new File("gifIn.gif");
		File fileOut = new File("gifOut.gif");
		
		printSaveGif(fileIn, fileOut);
		
	}
	
	private static void printSaveGif(File fileIn, File fileOut) {
		try(BufferedInputStream bufferInput = new BufferedInputStream(new FileInputStream(fileIn));
			BufferedOutputStream bufferOutput = new BufferedOutputStream(new FileOutputStream(fileOut))) {

			int n;
			do {
				n = bufferInput.read();
				bufferOutput.write(n);
				if(n != -1)
					System.out.print(n+" ");
			}while(n != -1);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	
	}
}
