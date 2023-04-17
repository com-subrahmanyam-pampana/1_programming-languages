=begin
1.It is similar to the while loop.Only diffrence is statement will run atlease once
As condition is written at the end of the code

     loop do
        #code to execute
        break if booleanExpression
     end  
=end

def test1
    loop do
        puts "Checking for correct answer"
        answer=gets.chomp
        if answer =="d"
            puts "Yes d is the correct answer"
            break
        end
    end
end
test1          
