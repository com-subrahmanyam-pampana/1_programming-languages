

#We use "=>" to add key value pair
def test1
    my_hash={'a'=>1,'b'=>2,'c'=>3}
    p my_hash['a']
    my_hash['a']=12
    p my_hash['a']
end    

=begin
Syntax: A.each_with_index
Here, A is the initialised object.
Parameters: This function does not accept any parameters.
Returns: the value of the given object.
=end
def test2
    puts "<<<<<<<<<<<<<<Iteration>>>>>>>>>>>>>"
    my_hash={'a'=>1,'b'=>2,'c'=>3}
    my_hash.each do |key,value|
     puts "Key =  #{key} and value = #{value}"
    end
    my_hash.each_with_index do |key,value|
        puts "Key =  #{key} and value = #{value}"
    end 
end
 
# def test3
#    # This program prints only the String values
#    my_hash={'a'=>2,'b'=>"Subbu",'c'=>3,'d'=>"Ram"}
#    print my_hash
#    my_hash.select{|k,v| v.is_a?(String)}
# end

test1
test2
# test3