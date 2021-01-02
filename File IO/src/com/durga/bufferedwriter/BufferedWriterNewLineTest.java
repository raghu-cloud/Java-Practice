package com.durga.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterNewLineTest {

	public static void main(String[] args) throws IOException {
		FileWriter fr=new FileWriter("test2.txt");
		BufferedWriter bw=new BufferedWriter(fr);
		bw.write(100);
		bw.write("urga");
		bw.newLine();
		bw.write("Sofware");
		bw.newLine();
		bw.write("Solution");
		bw.newLine();
		char[] ch= {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.flush();
		bw.close();
		
	}

}
