
=begin
A array can be created by
1.Using literal constructor
       arrayName=[1,2,true,"Hello"]
2.Using new class method
       arrayName=Array.new(size)
=end

def test1
    puts "<<<<<<<<<<<<<<<Test1>>>>>>>>>>"
    # Using literal constractural
    myarray=[1,2,3,4,5,6]
    puts myarray
    print myarray
    p myarray
    puts "...Using class.."
    myarray2=Array.new(10)
    #where 10 is the Array size and it is optional
    print myarray2
    myarray2[9]="I am 10th element"
end

def test2
    puts ""
    puts "<<<<<<<<<<<<<<<Test2>>>>>>>>>>"
    #You can also define array using dots
    myarray1=1..10
    puts myarray1
    puts ""
    print myarray1.to_a
    puts ""
    myarray2="a"..."z"
    puts myarray2
    puts ""
    print myarray2.to_a
    # to_a prints all elememts
end



def test4
    puts ""
    puts "<<<<<<<<<<<<<<<Non Homogenious>>>>>>>>>>"
    a=[1,2,3,true,"Hi"]
    puts a
   
end


test1
test2
test4