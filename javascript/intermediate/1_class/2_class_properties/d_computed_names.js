

class Animal{
    ['get'+'Sound'](){
        console.log("Bark......")
    }
    
    ['set'+'Sound'](){
        //set sound
    }
}

new Animal().getSound();