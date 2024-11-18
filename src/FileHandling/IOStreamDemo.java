package FileHandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("fFile.txt");
//		file.createNewFile();
//		DataOutputStream os = new DataOutputStream(new FileOutputStream(file));
//		
//		os.writeInt(1234);
//		os.flush();
//		os.close();
//		
		
		FileOutputStream os1 = new FileOutputStream(file);
		String data = "shubhi singh";
		os1.write(data.getBytes());
		os1.close();
		
		FileInputStream rd = new FileInputStream(file);
		
		FileInputStream is = new FileInputStream(file);
		int fileData;
		while((fileData=is.read())!=-1){
			System.out.println((char)fileData);
		}
		is.close();
	}

}
