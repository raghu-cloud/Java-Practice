package AnyPractice;

public class Testtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=60,c=40;
		int min=(a<b)?((a<c)?a:c):((b<c)?b:c);
		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		int avg=(a+b+c)/3;
		System.out.println(min+" "+max+" "+avg);

	}

}
