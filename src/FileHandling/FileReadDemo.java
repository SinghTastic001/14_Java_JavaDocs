package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadDemo {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\shubu\\eclipse-workspace\\JAVADOC\\src\\FileHandling\\Demo.txt");
		
//		try {
//			FileReader reader = new FileReader(file);
//			int data;
//			while((data = reader.read())!=-1) {
//				System.out.println((char)data);
//			}
//			reader.close();
//		}catch(IOException is) {
//			System.out.println("file not found");
//		}
		
//		try {
//			FileWriter writer = new FileWriter(file);
//			writer.write("Hello Shubhi");
//			writer.append("Hello Singh");
//			
//			writer.flush();
//			writer.close();
//		}catch(IOException i) {
//			System.out.println("no found data");
//		}
//		 
		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String data;
			while((data = br.readLine())!= null) {
				
				System.out.println(data);
			}
			br.close();
			reader.close();
		}catch(IOException n) {
			System.out.println("data not found");
		}
		
	}

}
