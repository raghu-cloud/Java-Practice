package fileio.application.examples;
import java.io.*;

public class MergeTwoFilesIntoThirdFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("File1.txt");
		File f2=new File("File2.txt");
		File f3=new File("File3.txt");
		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();
		PrintWriter pw1=new PrintWriter(f1);
	    PrintWriter pw2=new  PrintWriter(f2);
	    PrintWriter pw3=new PrintWriter(f3);
		pw1.println("AAA");
		pw1.println("BBB");
		pw1.println("CCC");
		pw2.println("222");
		pw2.println("333");
		pw2.println("444");
		pw2.println("555");
		BufferedReader br=new BufferedReader(new FileReader(f1));
		String s=br.readLine();
		while(s!=null)
		{
			pw3.println(s);
			s=br.readLine();
			
		}
		br=new BufferedReader(new FileReader(f2));
		s=br.readLine();
		while(s!=null)
		{
			pw3.println(s);
			s=br.readLine();
			
		}
		pw1.flush();
		pw2.flush();
		pw3.flush();
		br.close();
		pw1.close();
		pw2.close();
		pw3.close();
	
	}

}
