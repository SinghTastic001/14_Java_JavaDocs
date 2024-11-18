package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Home1Demo {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream input = new FileInputStream("C:\\Users\\shubu\\eclipse-workspace\\JAVADOC\\src\\FileHandling\\Demo.txt");
		FileOutputStream output = new FileOutputStream("C:\\Users\\shubu\\OneDrive\\Desktop\\LCCC.txt");
		int i;
		while((i=input.read())!=-1) {
			output.write((char)i);
		}
		System.out.println("data copied successfully");
	}

}
