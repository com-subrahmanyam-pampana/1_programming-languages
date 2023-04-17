"""

"""

def method1():
   a=2;
   b="Hi"
   print(a)
   print(b)
   

def method2():
    print("<<<<<<<<<Multiple Varibles>>>>>>>>>")  
    # Make sure number of varibles matches 
    x,y,z="Orange","bananna","Graphs"
    print(x)

def method3():
    print("<<<<<<<<<Multiple Varibles>>>>>>>>>")  
    # Make sure number of varibles matches 
    x,y,z="Orange","bananna","Graphs"
    print(x)    

def method3():
    print("<<<<<<<<<One value to multiple variables>>>>>>>>>")  
    # Make sure number of varibles matches 
    x=y=z="Orange";
    print(x) 
    print(y) 
    print(z)   

def method4():
    print("<<<<<<<<<Unpacking varibles>>>>>>>>>")  
    # If you have a collection of values in a list, tuple etc. 
    # Python allows you to extract the values into variables. 
    # This is called unpacking.
    fruits=["apple","Mango","banana"]
    x,y,z=fruits;
    print(x) 
    print(y) 
    print(z)            
 

method1()
method2()
method3()
method4()