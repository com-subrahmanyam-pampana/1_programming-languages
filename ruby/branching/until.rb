=begin


     until condition  
        #code to execute
     end  
=end

def test1
    x=gets.chomp.to_i
    until (x ==0) 
        puts x
        x -= 1
    end
end
test1          
