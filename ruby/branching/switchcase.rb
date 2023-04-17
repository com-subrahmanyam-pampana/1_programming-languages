=begin
    case expression
       when expression
         //code
       when  expression
        //code
       else 
         //code
    end      
=end

def test1
    x=gets.chomp.to_i
    case x
        when 1
            puts "One"
        when 2
            puts "Two"
        else 
            puts "Not 1 nor 2"
    end                
end
test1          
