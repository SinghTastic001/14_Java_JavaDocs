package FileHandling;

import java.io.File;

import java.io.IOException;

public class CreateFileDemo1 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\shubu\\OneDrive\\LC1.txt");
		
		if(f.createNewFile()) {
			System.out.println("file Create successfully");
		}
		else {
			System.out.println("Already exist");
		}
	}

}
