=begin
Puts automatically adds a new line at the 
end of your message every time you use it.
Every message will have its own line
=end
def test1
    puts "Hello This is Line 1"
    puts "Hello This is Line 2" 
    puts [1,2] 
    #converts every thing to string even it is empty
    puts [9,nil,nil,13]  
end 
=begin
you print something it will be one the same line as your last message.
=end
def test2
    print "Hello This is Line 1"
    print "Hello This is Line 2" 
    print [1,2]   
    print [9,nil,nil,13]
end 
def test3
    p "Hello This is Line 1"
    p "Hello This is Line 2"  
    p [1,2]  
    p [9,nil,nil,13]
end 
=begin
Pretty printing
This is like p, but it prints big hashes & arrays in a nicer way.
=end
def test4
    pp [23,2,3,4,6,7,8,9]
    data={"1"=>"one","2"=>"two","3"=>"three"}
    pp data
end 

puts "<<<<<<<<<<<<PUTS>>>>>>>>>>>>>>>"
test1()
puts "<<<<<<<<<<<<PRINT>>>>>>>>>>>>>>>"
test2()
puts ""
puts "<<<<<<<<<<<<P>>>>>>>>>>>>>>>"
test3()
puts "<<<<<<<<<<<<Prity printing>>>>>>>>>>>>>>>"
test4()

puts "<<<<<<<<<<<< Return values>>>>>>>>>>>>>>>"
=begin
puts always returns nil
p returns the object you pass to it
=end
def numbers1
    puts 123
end
def numbers2
    print 123
end
def numbers3
    print 123
end
result1=numbers1
result2=numbers2
result3=numbers3
puts result1.class
puts result2.class
puts result3.class






