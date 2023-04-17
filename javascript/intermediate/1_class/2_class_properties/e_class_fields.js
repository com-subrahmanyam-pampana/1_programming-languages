
class Animal{
    name="Dog";
    getName(){
        console.log(`I am a ${this,this.name}`)
    }
}

let animal=new Animal();
animal.getName();
console.log(animal.name);
console.log(Animal.prototype.name)//because fileds are not added to prototypes