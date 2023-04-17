def test1
    first_name ="Subbu";
    last_name ='Subbu';
    puts first_name
    puts last_name
    puts "my complete name is "+" "+first_name+last_name
    #To know the class of an varible.Use .class
    puts 10.class
end
test1    

=begin 
1.Class varibles starts with @@ sign
2.They need to be initialized before use
=end
puts "<<<<<<<<<Class Varibles>>>>>> "
class Student
    @@name=0
    def initialize(studentName)
        @@name=studentName
    end
    def printStudentInfo()
        puts "Name = " +@@name
    end        
end 
# create object
student1=Student.new("Subbu")
student1.printStudentInfo()

=begin 
1.Instance varibles starts with @ sign
2.It belongs to one instance of claass
3.It can be access anywhere with in the class
4.If you defines it in one method,you can access in another method
=end
puts "<<<<<<<<<Instance  Varibles>>>>>> "
class Student2
    def initialize(studentName)
        @name=studentName
    end
    def printStudentInfo()
        puts "Name = " +@name
    end
    def printStudentInfo2()
        #This will overide previously defined instance varible
        @name="Jack"
        puts "Name = " +@name
    end        
end 
# create object
student2=Student2.new("Subbu")
student2.printStudentInfo()
student2.printStudentInfo2()

puts "<<<<<<<<<Global Varibles>>>>>> "
=begin
1.It starts with $ sign
2.Scope is global.Can be accessed any where in the program
=end
$myFontSize=12
class FontSettings
    def printFontSize
        puts "Font = " +$myFontSize.to_s
    end
end 
# create object
font=FontSettings.new
font.printFontSize()

