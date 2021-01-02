package com.durga.filereaderr;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingAndWritingIntoNewFile {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("test.txt");
		FileWriter fw=new FileWriter("tt.txt");
		int i=fr.read();
		while(i!=-1)
		{
			
			fw.write((char)i);
			i=fr.read();
		}
		fw.close();
		fr.close();

	}

}
