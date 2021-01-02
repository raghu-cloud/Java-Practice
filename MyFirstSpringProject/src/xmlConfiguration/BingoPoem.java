package xmlConfiguration;


public class BingoPoem implements Poem {
	private String[] lines= {
			"hello there this is poetic juggler poem",
			"this is secong line of the poem",
			"and here poem ends......"
			};

	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for(String line:lines)
		{
			System.out.println(line);
		}

	}

}

