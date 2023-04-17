package b_oops.b_inhertience;
 


//A class can extends only 1 class.
public class MulipulInhertience {

	static class A {
		void msg() {
			System.out.println("Hello Bro!!!");
		}
	}

	static class B {
		void msg() {
			System.out.println("Whatsup Bro!!!!");
		}
	}
	//Both class A and Class B contains method 

//	static class C extends A,B{//suppose if it were  
//
//		public  void test() {
//			C obj = new C();
//			obj.msg();// Now which msg() method would be invoked?
//		}
//	}

}
