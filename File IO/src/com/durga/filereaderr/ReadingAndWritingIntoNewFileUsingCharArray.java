package com.durga.filereaderr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingAndWritingIntoNewFileUsingCharArray {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("test.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		try {
			fr.read(ch);
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileWriter fr2=new FileWriter("tt2.txt");
			fr2.write(ch);
			fr2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
