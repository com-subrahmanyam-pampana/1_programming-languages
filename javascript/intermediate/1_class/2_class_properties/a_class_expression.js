//We can assign class to a varible
let Animal=class{
    eats(){
        console.log("Animal eats")
    }
}
new Animal().eats();

//We can also add the class name
let Birds=class BirdsClass{
    eats(){
        console.log("Birds also  eats")
    }
}
new Birds().eats();