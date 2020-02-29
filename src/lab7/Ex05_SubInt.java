package lab7;

public class Ex05_SubInt extends Ex05_Super{
	protected int subInt;
	
	Ex05_SubInt()
	{
		
	}
	
	Ex05_SubInt(String Str, int SubInt)
	{
		this.str = Str;
		this.subInt = SubInt;
	}
	
	@Override
	public void getParams()
	{
		System.out.println("Класс: "+ this.getClass().getName() +" Значение полей: " +
							this.str + " и: " + this.subInt);
	}
}
