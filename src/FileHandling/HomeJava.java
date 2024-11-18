package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeJava {

	public static void main(String[] args) throws IOException {
		

		File file = new File("C:\\Users\\shubu\\eclipse-workspace\\JAVADOC\\src\\FileHandling\\Data1.txt");
		FileReader reader = new FileReader(file);
		BufferedReader rd = new BufferedReader(reader);
		String data;
		int countList=0;
		while((data = rd.readLine())!=null) {
			String[] parts = data.split(" ");
		    countList = countList + parts.length;
		    
		}
		System.out.println("Count of elements in line: " + countList);

		
		
		File file1 = new File("C:\\Users\\shubu\\eclipse-workspace\\JAVADOC\\src\\FileHandling\\DataR.txt");
        FileWriter writer = new FileWriter(file1);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("Count of elements in line: " + countList);
        bw.flush();
        bw.close();
        
        System.out.println("Count has been written to DataR.txt");
		 
	}
}
