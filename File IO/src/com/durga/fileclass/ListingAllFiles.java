package com.durga.fileclass;

import java.io.File;

public class ListingAllFiles {

	public static void main(String[] args)
	{
		int count=0;
		File f5=new File("D:\\New folder\\Durga soft SCJP");
		String[] s=f5.list();
		for(String s1:s)
		{
			File f2=new File(f5,s1);
			if(f2.isFile()) {

				count++;
				System.out.println(s1);
				
			}
		}
		System.out.println("total no of fiels= "+count);
	}

}
