=begin
next is used to skip next iteraion 
=end

def test1
    for i in 5..11
        if i ==7 then
            next
        end
        puts i
    end        
end
test1          
