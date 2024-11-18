package FileHandlingPrac;

import java.io.File;
import java.io.IOException;

public class RenameDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\shubu\\OneDrive\\Desktop\\LC.txt");
		File r = new File("C:\\Users\\shubu\\OneDrive\\Desktop\\LCCC.txt");
		
		if(f.exists()) {
			System.out.println(f.renameTo(r));
		}else {
			System.out.println("file doesnot exits");
		}
		
	}
}
