package com.durga.bufferedReader;
import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("test.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fr1=new FileWriter("testing.txt");
		BufferedWriter bw=new BufferedWriter(fr1);
		String str=br.readLine();
		while(str!=null)
		{
			System.out.println(str); 
			bw.write(str);
			bw.newLine();
			str=br.readLine();
		}
		br.close();
		bw.close();

	}

}
