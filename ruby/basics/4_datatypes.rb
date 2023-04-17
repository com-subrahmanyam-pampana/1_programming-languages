=begin
Numbers
String
Symbols
Hashes
Arrays
Boolean
=end
puts "<<<<<<<<<<Integers>>>>>>>>>>"
a=2+3
puts a
b=2.0+3.0
puts b
c= 2+4.0
puts c

puts "<<<<<<<<<<Strings>>>>>>>>>>"
s1='Hello'
puts s1
s2="Hello"
puts s2
puts "<<<<<<<<<<Symbols>>>>>>>>>>"
=begin
1.Symbols are similar to strings but they are immutable where
 as strings are mutable 
2.An immutable object is something that cannot be changed.
3.When you create an immutable object, it will remain the same until it is destroyed:
=end
myMutableString1="Hi"
myMutableString1 +=" Subbu"
puts myMutableString1
#If you check the output,it will print "Hi Subbu"
#Strings are  i mutable but symbols are not 
mySymbol=:Hi
puts mySymbol.class
#mySymbol += 'Subbu' #uncomment to test
puts mySymbol

puts "<<<<<<<<<<Hashes>>>>>>>>>>"
=begin
We can assign value to key with =>
=end
data ={"1"=>"one","2"=>"two"}
puts data["1"]

puts "<<<<<<<<<<Arrays>>>>>>>>>>"
=begin
=end
myarray =[1,2,3]
puts myarray[0]
puts myarray[1]
