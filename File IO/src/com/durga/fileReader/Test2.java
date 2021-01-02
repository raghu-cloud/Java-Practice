package com.durga.fileReader;
import java.io.*;

public class Test2 {

	public static void main(String[] args)throws IOException {
		File f1=new File("D:\\Directory","Testing.txt");
		FileWriter fw1=new FileWriter(f1,true);
		fw1.write(102);
		char[] ch= {'\n','a','b','\n','c','d'};
		fw1.write('\n');
		fw1.write(ch);
		fw1.write("\nHello there how are you all!!!!!!!!!!!!!!!");
		fw1.flush();
		fw1.close();
		
	}

}
