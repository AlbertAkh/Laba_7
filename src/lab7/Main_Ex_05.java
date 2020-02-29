package lab7;

public class Main_Ex_05 {
	
	public static void main(String[] args) {
		Ex05_Super A = new Ex05_Super("для создания объекта Супер");		
		A.getParams();
		
		Ex05_SubInt B = new Ex05_SubInt("для создания объекта СубИнт", 7);		
		B.getParams();
		
		Ex05_SubChar C = new Ex05_SubChar("для создания объекта СубЧар", 'g');		
		C.getParams();
	}	
	
}
