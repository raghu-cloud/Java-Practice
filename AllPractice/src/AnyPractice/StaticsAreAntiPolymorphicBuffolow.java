package AnyPractice;

public class StaticsAreAntiPolymorphicBuffolow extends StaticsAreAntiPolymorphicAnimal{
	
	public static void print()
	{
		System.out.println("Buffelow print");
	}

	public static void main(String[] args) {
		StaticsAreAntiPolymorphicAnimal animal=new StaticsAreAntiPolymorphicBuffolow();
		animal.print();

	}

}
