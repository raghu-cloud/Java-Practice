package com.durga.fileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteAppend {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("Test.txt",true);
		fw.write("this is another FileWriter");
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
	

	}

}
