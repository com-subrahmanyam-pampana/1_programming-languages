class User
    @user_id

    #Setter
    def user_id=(id)
        @user_id = id
    end
    
    #Getter
    def user_id
        @user_id
    end
    def to_s
    end    
end  
    
    
    
    user = User.new
    user.user_id=1
    print(user.user_id)