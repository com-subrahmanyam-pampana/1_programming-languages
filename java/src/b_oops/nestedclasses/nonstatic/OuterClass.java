package b_oops.nestedclasses.nonstatic;

public class OuterClass {

	static int x = 1;

	int y = 2;

	public class StaticNestedClass {
		public void myinnermethod1() {
			System.out.println(x + y);

		}
	}

}
