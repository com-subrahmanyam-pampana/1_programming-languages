package oops.e_interfaces;


interface MyFirstInterface{
    void sum(int a,int b);
    /*Interface should not have body*/

    void multiplication(int a,int b);

}

class MyFirstInterfaceClass implements MyFirstInterface{

    /*We use implements keyword to use the interface*/

    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println(a*b);
    }
}

public class A_Interface   {

    public static void main(String[] args){
        MyFirstInterfaceClass myFirstInterfaceClass=new MyFirstInterfaceClass();
        myFirstInterfaceClass.sum(2,3);
        myFirstInterfaceClass.multiplication(5,8);

    }

}
