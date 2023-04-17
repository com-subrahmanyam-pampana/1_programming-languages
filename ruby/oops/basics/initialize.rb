class User
    attr_accessor :user_name,:user_id
  
    def initialize(user_id,user_name)
      @user_id=user_id;
      @user_name=user_name;
    end 
    
    def to_s
        puts "User name is #{@user_name} and user Id is #{@user_id}"
    end    

end 

user1 =User.new(1,"Subbu");

user2 =User.new(2,"Rabbu");

puts user1
puts user2

