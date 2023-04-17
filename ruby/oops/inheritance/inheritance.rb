=begin
Ruby does not support multiple levels of inheritance. Instead it supports mixins.

In Ruby, < character is used to create a subclass. The syntax is shown below:
=end

class Parent   
  
    def initialize   
        puts "Parent class created"   
    end   
end   
  
class Child < Parent   
  
   def initialize   
       super   
       #The super method calls the constructor of the Parent class.
       puts "Child class created"   
   end   
end   
  
Parent.new   
Child.new  

