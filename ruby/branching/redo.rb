=begin
 Redo is used to repeat the current iteration of the loop
 It is executed without evalution of loop's condition
=end
def test1
    puts "<<<<With out  redo>>>>"
    i=0
    while (i<5) 
        puts i
        i+=1
    end 
    puts "<<<<With redo>>>>"
    j=0
    while (j<5) 
        puts j
        j+=1
        redo if j==5
    end 
end
test1

=begin
Retry is uded to loop the iteration from start
=end
def test2
    puts "<<<< Retry>>>>"
    i=0
    while (i<5) 
        puts i
        i+=1
    end 
    #retry
end
test2
