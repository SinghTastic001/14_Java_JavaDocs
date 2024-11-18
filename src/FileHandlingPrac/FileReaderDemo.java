package FileHandlingPrac;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader rd = new FileReader("C:\\Users\\shubu\\OneDrive\\Desktop\\LC.txt");
		
		int i;
		while((i=rd.read())!=-1) {
			System.out.println((char)i);
			
			
		}
		
	}

}
