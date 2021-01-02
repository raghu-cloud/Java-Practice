package com.durga.bufferedReader;
import java.io.*;

public class TestingIo {
	public static void main(String[] args) throws IOException
	{
		File f1=new File("TestingAll.txt");
		FileReader fr=new FileReader("testing.txt");
		FileWriter fw=new FileWriter(f1);
		try {
			int i=fr.read();
			while(i!=-1)
			{
				fw.write((char)i);
			}
			fw.flush();
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
