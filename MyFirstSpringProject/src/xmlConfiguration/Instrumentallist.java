package xmlConfiguration;

public class Instrumentallist implements Performer {
	private Instrument instruement;
	private String song;
	public Instrument getInstruement() {
		return instruement;
	}
	public void setInstruement(Instrument instruement) {
		this.instruement = instruement;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public  Instrumentallist() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Instrumentallist Constructor");
	}
	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("I am Instrumentallist performing song "+song);
		instruement.play();
	}

}
