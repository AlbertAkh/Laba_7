package lab7;

public class Ex05_SubChar extends Ex05_Super{
	protected char ch;
	
	Ex05_SubChar()
	{
		
	}
	
	Ex05_SubChar(String Str, char  Ch)
	{
		this.str = Str;
		this.ch = Ch;
	}
	
	@Override
	public void getParams()
	{
		System.out.println("Класс: "+ this.getClass().getName() +" Значение полей: " +
							this.str + " и: " + this.ch);
	}
}
