package lab7;

public class Ex05_Super {
	protected String str;
	
	Ex05_Super()
	{
		
	}
	
	Ex05_Super(String Str)
	{
		this.str = Str;
	}
	
	public void getParams()
	{
		System.out.println("Класс: "+ this.getClass().getName() +" Значение поля: " +
							this.str);
	}
}
