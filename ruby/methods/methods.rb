=begin
    def methodName  
        code...  
     end 
     
     
1.Methods name should always start with a lowercase letter. 
Otherwise, it may be misunderstood as a constant.     
=end

def test1
    puts "<<<<<<Test1>>>>>>>>>"

end


def test2(name)
    puts name
    puts "<<<<<<Test1>>>>>>>>>"

end

test1
test2("Subbu")