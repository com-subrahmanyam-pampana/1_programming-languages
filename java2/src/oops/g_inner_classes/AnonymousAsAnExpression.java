package b_oops.innerclasses;


import java.util.ArrayList;
import java.util.List;

class Polygon3 {
	public void display() {
		System.out.println("Inside the Polygon class");
	}
}
class AnonymousDemo3 {
	public void createClass() {
		List<Polygon> actions = new ArrayList<Polygon>();
		actions.add(new Polygon() {
			public void display() {
				System.out.println("Inside an anonymous class.");
			}
		});
	}
}
public class AnonymousAsAnExpression {

}
