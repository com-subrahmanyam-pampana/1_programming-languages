def test1
    if !true
        puts "subbu"
    elsif !false
        puts "Jabbu"    
    else 
        puts "Gabbu"
    end 
end

def test2
    condition1=true;
    condition2=true;
    condition3=false;
    if(condition1)
        puts "Condition 1 is true"
    end    
    if (condition1 && condition2)
        puts ("Both conditions 1 and 2 are true \n")
     end
     if (!condition1 || condition3 || condition2)
        puts("One of  conditions 1 or  2  or 3 is  false")
     end
end

def test3
    if(2>3)
        puts "2 is not greter than 3"
    elsif(2==3)
        puts "2 is not equal to 3"
    else
        puts "2 is small than 3"
    end
end    

=begin
Terinary statement:
 testExpression?if-true expression:if false expression
=end
def test4
     a=2
     b=3
    smallNumber=((a<b) ? a : b);
    puts smallNumber
    bigNumber = if (a>b) then a else b end;
    puts bigNumber    
end    

puts "<<<<<<<<<Test1>>>>>>>";
test1
puts "<<<<<<<<<Test2>>>>>>>";
test2()
puts "<<<<<<<<<Test3>>>>>>>";
test3()
puts "<<<<<<<<<Terinary operator>>>>>>>";
test4







