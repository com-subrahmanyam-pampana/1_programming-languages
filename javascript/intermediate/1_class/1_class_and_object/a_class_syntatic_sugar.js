class Animal {
    constructor(name) {
      this.name = name;
    }  
    eats() {
      console.log(this.name +" Eats");
    }
}  
let animal = new Animal("Tiger");
animal.eats();
/*
Under the hood 
1.It created a function called Animal
2.The function code is taken from the constructor method
3.It stores eats method in Animal.prototype
 */

console.log("<<<<Type of Animal>>>>")
console.log(typeof Animal);//function
console.log(Animal ===Animal.prototype.constructor);//true
console.log(Animal.prototype.eats);
console.log(Animal.prototype.constructor);