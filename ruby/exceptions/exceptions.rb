=begin

=end

def test1
    puts "<<<<<<Test1>>>>>>>>>"
    def raise_and_rescue     
        begin     
          puts 'Before the raise.'     
          raise 'An error occured.'     
          puts 'After the raise.'     
        rescue     
          puts 'Code rescued.'     
        end     
        puts 'After the begin block.'     
      end     
      raise_and_rescue 

end


def test2
    puts " "
    puts "<<<<<<Test1>>>>>>>>>"

end

test1
test2