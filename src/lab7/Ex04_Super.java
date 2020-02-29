package lab7;

public class Ex04_Super {
	public char ch;
	
	Ex04_Super()
	{
		
	}
	
	Ex04_Super(char Ch)
	{
		this.ch = Ch;			
	}
	
	Ex04_Super(Ex04_Super testSuper)
	{
		this(testSuper.ch);
	}
	
	public void getParams()
	{
		System.out.println(this.ch);
	}
}
