package lab7;

public class Ex04_Main {

		public static void main(String[] args) {
			Ex04_Super A = new Ex04_Super('a');
			Ex04_Super B = new Ex04_Super(A);
			B.getParams();
			
			Ex04_Sub1 C = new Ex04_Sub1('b', "для создания объекта подкласса");
			Ex04_Sub1 D = new Ex04_Sub1(C);
			D.getParams();
			
			Ex04_Sub2 E = new Ex04_Sub2('c', "для создания объекта подкласса 2", 23);
			Ex04_Sub2 F = new Ex04_Sub2(E);
			F.getParams();
		}
}
