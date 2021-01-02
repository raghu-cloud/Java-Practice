package com.durga.fileReader;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f=new File("D:\\New folder");
		String[] str=f.list();
		for(String s:str)
		{
	        File f2=new File(f,s);
	        if(f2.isDirectory())
			System.out.println(s);
			
		}

	}

}
