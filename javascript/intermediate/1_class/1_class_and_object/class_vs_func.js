
// class Animal {
//     constructor() {
//       console.log("I am a constructor")
//     }  
//     eats() {
//       console.log("I am a method")
//     }
// }  


function Animal() {
  console.log("I am a constructor");
}

Animal.prototype.eats = () => {
  console.log("I am a method");
};

let animal = new Animal();
animal.eats();
