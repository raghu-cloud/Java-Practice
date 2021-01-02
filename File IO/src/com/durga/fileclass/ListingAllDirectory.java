package com.durga.fileclass;

import java.io.File;

public class ListingAllDirectory {

	public static void main(String[] args) {
	    int count=0;
		File f=new File("D:\\New folder\\Durga soft SCJP");
		String[] s=f.list();
		for(String s3:s)
		{
			File f3=new File(f,s3);
			if(f3.isDirectory())
			{
				count++;
				System.out.println(s3);
			}
		
		}
		System.out.println("total no of directories= "+count);

	}

}
