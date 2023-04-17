
def test6
    puts " "
    puts "<<<<<<Ampersand parameter (&block)>>>>>>>>>"
    #The &block is a way to pass a reference (instead of a local variable) to the block to a method.
    #Here, block word after the & is just a name for the reference, any other name can be used instead of this.
    ampersandTest { puts "This is &block example" } 
end

def ampersandTest(&block)   
    puts "This is method"   
    block.call   
  end   
   


test6