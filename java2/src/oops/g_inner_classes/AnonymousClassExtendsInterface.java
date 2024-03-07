package b_oops.innerclasses;

interface Polygon2 {
	public void display();
}

class AnonymousDemo2 {
	public void createClass() {

		// anonymous class implementing interface
		Polygon2 p1 = new Polygon2() {
			public void display() {
				System.out.println("Inside an anonymous class.");
			}
		};
		p1.display();
	}
}

public class AnonymousClassExtendsInterface {
	public static void main(String[] args) {
		AnonymousDemo2 an = new AnonymousDemo2();
		an.createClass();
	}
}

