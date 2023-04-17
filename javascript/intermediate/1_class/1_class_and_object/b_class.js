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