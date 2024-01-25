function Animal(name){
    this.name=name;
}
let animal = new Animal("Tiger");

//Now you can also add a method to your class
Animal.prototype.eats=function(){
    console.log(this.name +" Eats");
}
animal.eats();

