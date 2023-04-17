package a_basics.a_hello;

public class MainMethod{
	///////Main method overloading/////////
	/*Only Main method with String[] as argument  is called */
	public static void main(String[] args) {
		System.out.printf("This is the main method");
	}
	public static void main(int[] args) {
		//Ignored
		System.out.printf("This is the int method");
	}
	public static void main(){
		//Ignored
		System.out.println("This is the no args");
	}
}

