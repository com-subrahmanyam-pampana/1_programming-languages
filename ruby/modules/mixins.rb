=begin

Ruby doesn't support multiple inheritance. Modules eliminate the need of multiple inheritance using mixin in Ruby.

A module doesn't have instances because it is not a class. However, a module can be included within a class.
When you include a module within a class, the class will have access to the methods of the module.
=endmodule Name   
   def bella   
   end   
   def ana   
   end   
end   
module Job   
   def editor   
   end   
   def writer   
   end   
end   
  
class Combo   
include Name   
include Job   
   def f   
   end   
end   
  
final=Combo.new   
final.bella   
final.ana   
final.editor   
final.writer   
final.f  
