package a_basics.datatypes;

public class NarrowingTypeCasting {
	
	
	public static void narrowTypeCasting() {
		double myDouble = 9.78;
		int myInt = (int) myDouble; // Manual casting: double to int
		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9
	}
	
	public static void stringToInt() {
		String s="2";
		int x=Integer.parseInt(s);
	}
	public static void main(String[] args) {
		
		stringToInt();
	
	}
	
	
	
}
