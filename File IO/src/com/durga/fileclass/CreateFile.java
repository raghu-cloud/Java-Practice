package com.durga.fileclass;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f=new File("Test.txt");
		boolean b=f.exists();
		System.out.println(b);
		f.createNewFile();
		boolean b1=f.exists();
		System.out.println(b1);
		

	}

}

