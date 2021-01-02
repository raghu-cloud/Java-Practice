package com.durga.filereaderr;
import java.io.*;

public class Test {

	public static void main(String[] args)throws IOException {
		File f=new File("D:\\Directory","Testing.txt");
		FileReader fr=new FileReader(f);
		int i=fr.read();
		while(i!=-1) {
		System.out.print((char)i);
		i=fr.read();
		}
		fr.close();
		
		FileReader fr2=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr2.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
		fr2.close();
		
		
		

	}

}
