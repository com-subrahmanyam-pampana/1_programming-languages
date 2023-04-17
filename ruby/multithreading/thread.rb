=begin
Thread Initialization
To create a new thread Ruby provides three keywords namely, ::new, ::start and ::fork.

To start a new thread, associate a block of code with a call to Thread.new, Thread.start or Thread.fork. Thread will be created. The new thread exits when the block exit.

Syntax:

# Original thread runs  
Thread.new {  
  # New thread is created.  
}  
# Original thread runs  


Thread Termination
There are different ways to terminate a thread in Ruby. To exit a given thread, class ::kill is used.

Syntax:

thr = Thread.new { ... }  
Thread.kill(thr)  

=end

th = Thread.new do #Here we start a new thread   
    Thread.current['counter']=0   
    5.times do |i| #loop starts and increases i each time   
      Thread.current['counter']=i   
      sleep 1   
    end   
    return nil   
  end   
  while th['counter'].to_i < 4  do   
  =begin   
  th is the long running thread   
  and we can access the same variable   
  from inside the thread here   
  =end   
    puts "Counter is #{th['counter']}"   
    sleep 0.5   
  end   
  puts "Long running process finished!"   