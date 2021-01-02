package com.durga.fileclass;

import java.io.File;
import java.io.IOException;

public class CreateDirectory {
	public static void main(String[] args) throws IOException
	{
		File f=new File("Directory");
		boolean b=f.mkdir();
		System.out.println(b);
		
		File f1=new File("Directory","testdirectory.txt");
		f1.createNewFile();
		
		
		File f2=new File(f,"testdirectory2.txt");
		f2.createNewFile();
		
		
		File f3=new File("D:\\New folder");
		File f4=new File(f3,"testtext.txt");
		f4.createNewFile();
		
		
		
		
	
		
	}

}
