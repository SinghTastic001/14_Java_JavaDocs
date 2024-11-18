package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\shubu\\OneDrive\\Desktop\\LC.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("file successfully created");
			}
			else {
				System.out.println("File already exist");
			}
		}catch(IOException i){
			System.out.println("Exception Handled...!");
		}
		
	}

}
