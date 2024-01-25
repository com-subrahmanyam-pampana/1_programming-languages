class Animal {
    constructor() {
      console.log("I am a constructor")
    }  
    eats() {
      console.log("I am a method")
    }
}  
let animal = new Animal();
animal.eats();