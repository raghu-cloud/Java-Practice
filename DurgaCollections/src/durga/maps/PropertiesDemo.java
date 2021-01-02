package durga.maps;
import java.util.*;
import java.io.*;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		File f=new File("Test.txt");
		f.createNewFile();
		FileInputStream fis=new FileInputStream("Test.txt");
		p.load(fis);
		String username=p.getProperty("user");
		System.out.println("user name="+username);
		String pass=p.getProperty("pwd");
		System.out.println("password="+pass);
		String add=(String) p.setProperty("nag", "8888");
		FileOutputStream fos=new FileOutputStream("Test.txt");
		p.store(fos, "updated by Raghu");

	}

}
