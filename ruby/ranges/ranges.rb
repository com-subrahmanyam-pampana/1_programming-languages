=begin
Range=Set of values with a beging and a end
Syntax:
1.    
       start..end
     Two  dots seperate start and end of the range
      start...end
     Three dots seperate start and end of the range
2. We can define with
    ::new   

=end

def test1
    a=1..5
    b=1...5
    puts a
    puts b
    #Convert to array
    puts " "
    puts "Conver to array"
    a=(1..5).to_a;
    b=(1...5).to_a;
    puts "a value:"
    puts a
    puts "b value:"
    puts b
    puts "End"
end

def test2
    puts " "
    puts "Char Range"
    a="a".."z"
    b=("a"..."d").to_a
    puts a
    puts b
end


def test3
    puts " "
    puts "Order Matters"
    a=(5..1).to_a
    b=(1..5).to_a
    puts "a value is :"
    puts a
    puts "b value is :"
    puts b
    #a value is empty because we can not generate range frpm 5 to 1
    # You can use reverse to print a
    myrevA=(5..1).to_a.reverse
    puts "myrevA value after reverse is :"
    puts myrevA
    # You can generate negateves also
    c=(-5..-1).to_a
    puts "c value is :"
    puts c
end

=begin
Variety ways of define ranges
1.Range as sequence
2.Range as condition
3.Range as intervals
=end

def test4
    puts "<<<<<<<<Range as sequence>>>>>>>>>"
    range = 0..5   
  
     puts range.include?(3)   
     ans = range.min   
     puts "Minimum value is #{ans}"   
  
    ans = range.max   
   puts "Maximum value is #{ans}"   
  
   ans = range.reject {|i| i < 5 }   
    puts "Rejected values are #{ans}"   
  
    range.each do |digit|   
      puts "In Loop #{digit}"   
    end  
end


def test5
    puts "<<<<<<<<Range as condition>>>>>>>>>"
    budget = 50000   
    watch = case budget   
              when 100..1000 then "Local"   
              when 1000..10000 then "Titan"   
              when 5000..30000 then "Fossil"   
              when 30000..100000 then "Rolex"   
             else "No stock"   
            end   
    puts watch  
end


def test6
    puts "<<<<<<<<Range as intervals>>>>>>>>>"
    if (('a'..'z') === 'v')   
        puts "v lies in the above range"   
      end   
        
    if (('50'..'90') === 99)   
        puts "z lies in the above range"   
    end  
end



test1
test2
test3
test4
test5
test6


