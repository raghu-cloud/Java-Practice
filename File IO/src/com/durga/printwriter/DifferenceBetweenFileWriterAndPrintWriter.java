package com.durga.printwriter;
import java.io.*;

public class DifferenceBetweenFileWriterAndPrintWriter  {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("Demo.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println("c");
		pw.println("durga");
		pw.flush();
		pw.close();
		
		
	
		
		
		
		
		
		
	
		
		
		
	}
	

}
