function Animal(name){
    this.name=name;
}
Animal.prototype.eats=function(){
    console.log(this.name +" Eats");
}

let animal = new Animal("Tiger");
animal.eats();