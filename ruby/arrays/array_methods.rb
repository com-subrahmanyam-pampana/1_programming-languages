=begin
We can add elements in diffrent ways
1.push or <<
2.unshift
3.Insert
=end

def test1
    puts "<<<<<<<<<<<<<<<Adding elememts to array>>>>>>>>>>"
    myarray=[4,5,6,7,8,9]
    puts "Shift"
    #This will add elements at end of the array
    myarray<<10
    print myarray
    puts " "
    puts "Append"
    myarray.append(11)
    print myarray
    puts ""
    puts "Un Shift"
    #This will add elements at begining  of the array
    myarray.unshift(3)
    print myarray
    puts ""
    puts "Insert"
    #We can add at any position
    myarray.insert(0,"start")
    print myarray
end

=begin
We can remove elemets
1.pop
2.shift
3.delete
4.uniq
=end
def test2
    puts ""
    puts "<<<<<<<<<<<<<<< Remove elememts to array>>>>>>>>>>"
    myarray=[1,2,3,4,5,6,7,8,9]
    print myarray
    puts ""
    puts "POP"
    myarray.pop
    print myarray
    puts ""
    puts "Shift"
    myarray.shift #Removes start of the array
    print myarray
    puts ""
    puts "Deleting 5"
    myarray.delete(5) #Removes elents passed to the function
    print myarray
   
end
def test3
    puts ""
    puts "<<<<<<<<<<<<<<<Reverse elememts to array>>>>>>>>>>"
    myarray=[4,5,6,7,8,9]
    print myarray
    puts ""
    print myarray.reverse
end

test1
test2
test3
