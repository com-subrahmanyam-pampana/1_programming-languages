package b_oops.abstraction.basic1.Paint;

public class PaintMainClass {

	static void paint(PaintAnObject object, String color) {
		object.chooseColor(color);
		object.paint();
	}

	public static void main(String[] args) {

		int userOption = 1;
		if (userOption == 1) {
			paint(new Reactangle(), "RED");
		} else if (userOption == 2) {
			paint(new Circle(), "RED");
		}

	}

}
