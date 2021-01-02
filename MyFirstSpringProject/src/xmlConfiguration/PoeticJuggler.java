package xmlConfiguration;



public class PoeticJuggler extends Juggler {

	Poem poem;
	String name;
	

	public PoeticJuggler(int n,Poem poem) {
		super(n);
		this.poem=poem;
		System.out.println("Inside Poetic Juggler constructor");
	}
	
	@Override
	public void perform() throws PerformanceException {
		
		super.perform();
		
		System.out.println("While reciting... ");
		poem.recite();
	}

}
