package xmlConfiguration;

import java.util.Collection;

public class OneManBand implements Performer {
	private Collection<Instrument> instrument;
    private String song;
    public void init()
    {
    	System.out.println("inside init of Onemanband");
    }
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Collection<Instrument> getInstrument() {
		return instrument;
	}

	public void setInstrument(Collection<Instrument> instrument) {
		this.instrument = instrument;
	}
	public OneManBand() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside one man band no arg constructor");
	}

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("I am onemand band playing with "+song);
		for(Instrument in:instrument)
		{
			in.play();
		}

	}

}
