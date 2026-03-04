package file;

import java.io.*;

public class FileDemo{
	public static void main(String[] args) throws IOException {
		File f = new File("sample4.txt");
		if(f.createNewFile()) {
			System.out.println("file created");
		}else {
			System.out.println("file not created");
		}
	
		System.out.println(f.exists());
		 System.out.println(f.getName());
	        System.out.println(f.getAbsolutePath());
	     
		
		
	}
}