package com.allPractice;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;

public class Program1 {
	
	public static void main(String[] args)
	{
		File source=new File( "D:\\New folder\\8th sem");
	
		File dest=new File("F:\\New folder");
		
		FileFilter filter=
		
		try {
			 FileUtils.copyDirectory(source, dest, filter, true);
			 
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Files copies sucessfully");
	}

}
