=begin
Each Ruby class is an instance of class Class. 
Classes in Ruby are first-class objects.

Ruby class always starts with the keyword class followed by the class name. 
Conventionally, for class name we use CamelCase. 
The class name should always start with a capital letter. 
Defining class is finished with end keyword.
class ClassName  
    codes...  
end  
=end


class MyTestClass    
    def sayHello
        puts "Hello,I am from MyTestClass class "
    end    
end 

=begin
1.Object is the default root of all Ruby objects. 
2.Ruby objects inherit from BasicObject 
(it is the parent class of all classes in Ruby) which allows creating 
alternate object hierarchies.

3.Object mixes in the Kernel module which makes the built-in Kernel 
functions globally accessible.

4.Syntax:

objectName = className.new
=end

def test1
    puts "<<<<<<Test1>>>>>>>>>"
    myclass = MyTestClass.new() 
    myclass.sayHello
end

test1
