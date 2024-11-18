package FileHandlingPrac;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\shubu\\OneDrive\\Desktop\\FileC.txt");
		if(file.createNewFile()) {
			System.out.println("file created");
		}else {
			System.out.println("file already exists");
		}
		
	}

}
