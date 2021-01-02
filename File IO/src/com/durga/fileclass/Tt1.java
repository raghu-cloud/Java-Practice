package com.durga.fileclass;

import java.io.File;
import java.io.IOException;

public class Tt1 {

	public static void main(String[] args)throws IOException{
		File f1=new File("D:\\","Directory");
		boolean b=f1.mkdir();
		if(b==true)
		{
			System.out.println("Directory creation with name Directory sucess");
			
		}
		else
			System.out.println("Directory creation fails or directory may be already existed with that name");
		File f2=new File("D:\\Directory","Testing.txt");
		boolean b2=f2.createNewFile();
		if(b2==true)
		{
			System.out.println("creating text file suceeded ");
			
		}
		else 
			System.out.println("same name txt file already existed");
		File list=new File("D:\\New folder");
		String[] str=list.list();
		for(String str1:str)
		{
			File list2=new File(list,str1);
			if(list2.isDirectory())
			{
				System.out.println(str1);
			}
		}
		File list2=new File("D:\\New folder");
		String [] str2=list2.list();
		for(String s:str2)
		{
			File f4=new File(list2,s);
			if(f4.isFile()) 
			{
				System.out.println(s);
			}
			
		}
		File f5=new File("D:\\New folder","fooook");
		boolean b5=f5.mkdir();
		System.out.println(b5);
		boolean bb=f5.delete();
		System.out.println(bb);
	}

}
