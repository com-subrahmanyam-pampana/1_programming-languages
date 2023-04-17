#attr_reader allow only for read 
class User
    attr_reader :user_id

    def user_id
        @user_id =1
    end    
    
end
    
    user =User.new;
    
    print user.user_id;