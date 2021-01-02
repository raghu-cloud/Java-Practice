package com.durga.fileReader;
import java.io.*;

public class FileWriterr {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("test.txt");
		fw.write(100);
		fw.write("urga");
		fw.write(32);//ascii vlue for charecter 32 is space
		fw.write("software");
		fw.write(32);
		fw.write("solutions");
		fw.write(32);
	
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
		
		File f2=new File("test2.txt");
		f2.createNewFile();
		FileWriter fw3=new FileWriter(f2);
		fw3.write("Hey therre!!!!!!!!!!!! Chese\n");
		fw3.flush();
		fw3.close();
		
		
	}

}
