package b_oops.e_interfaceexamples.interfaceproperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 It is an empty interface (no field or methods). 
 Examples of marker interface are Serializable, Cloneable and Remote interface.
  All these interfaces are empty interfaces. 
 

public interface Serializable 
{
  // nothing here
}
 * */


/*
 public interface Serializable {
}
 * */
class AStudentClass implements Serializable {

	int roolNumber;
	String name;

	AStudentClass(int roolNumber, String name) {

		this.roolNumber = roolNumber;
		this.name = name;

	}

}

public class MarkerInterface {

	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		AStudentClass student = new AStudentClass(1, "Subbu");

		FileOutputStream f = new FileOutputStream("xyz.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(f);
        oos.writeObject(student);
        
        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        AStudentClass b = (AStudentClass)ois.readObject();//down-casting object
  
        System.out.println(b.roolNumber+" "+b.name);
  
        // closing streams
        oos.close();
        ois.close();

	}

}
