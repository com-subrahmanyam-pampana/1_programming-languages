package b_oops.e_interfaceexamples.interfaceproperties;


/*
 
 
 Another feature that was added in JDK 8 is that we can now define static methods in interfaces that can be called independently without an object. 
 Note: these methods are not inherited.
 * */


  interface StaticFieldInterface
{
    final int a = 10;
    static void display()
    {
        System.out.println("hello");
    }
    
    
     void display2();
}

public class StaticFieldsInInterface implements StaticFieldInterface {
	
	
	// Driver Code
    public static void main (String[] args)
    {
    	In1Static.display();
    }
    
    
    @Override
    public
    void display2(){
    	
    }
    

}
