package FileHandling;

import java.io.File;

public class FileInfoDemo {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\shubu\\OneDrive\\Desktop\\LC.txt");
		
		if(file.exists()) {
			System.out.println("FIle Name "+ file.getName());
			System.out.println("file Location  "+file.getAbsolutePath());
			System.out.println("File Writable "+file.canWrite());
			System.out.println("FIle Readable "+file.canRead());
			System.out.println("file Size  "+file.length());
		}
		else {
			System.out.println("File doesnot exits");
		}
	}

}
