=begin
Ruby code blocks are called closures in other programming languages. 
It consist of a group of codes which is always enclosed with
 braces or written between do..end. 

=end

=begin
A block is written in two ways,
(i)Multi-line between do and end (multi-line blocks are niot inline)
(ii).Inline between braces {}
block_name{  
   statement1  
   statement2  
   ..........  
}  
=end
def test1
    puts "<<<<<< multi-line block.>>>>>>>>>"
    [10, 20, 30].each do |n|   
        puts n   
       end  
end


def test2
    #The yield statement is used to call a block within a method with a value.
    puts " "
    puts "<<<<<<Test2>>>>>>>>>"
    myYieldTest{puts "This is block"}

end
def myYieldTest
    puts "This is method"   
    yield   
    puts "You will be back to method"   
    yield   
end        

def test3
    puts " "
    puts "<<<<<<Passing parameters with yield statement>>>>>>>>>"
    myMetYield2 {|i| puts "This is block #{i}"}  
end

def myMetYield2   
    yield 1   
    puts "This is method"   
    yield 2   
 end 

def test4
    puts " "
    puts "<<<<<<Bloack Varibles>>>>>>>>>"
    x = "Outer variable"    
    3.times do |x|    
      puts "Inside the block: #{x}"    
    end    
    puts "Outside the block: #{x}"  

end






test1
test2
test3
test4

