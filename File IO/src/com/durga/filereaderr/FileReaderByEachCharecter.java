package com.durga.filereaderr;


import java.io.*;

public class FileReaderByEachCharecter {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("test.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();

	}

}
