package b_oops.nestedclasses.nonstatic;

public class Test1 {

	public static void main(String[] args) {
		OuterClass outerClass =new OuterClass();
		OuterClass.StaticNestedClass nestedObject =  outerClass.new StaticNestedClass();
		nestedObject.myinnermethod1();

	}
}
