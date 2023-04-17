//Varibles defined outside the functions are global varibles
var x=2;
let y=3;
const z=4;

function test(){
    g=45;
    console.log(x);
    console.log(y);
    console.log(z);   
}
console.log(x);
console.log(y);
console.log(z);
//Variables created without a declaration keyword (var, let, or const) are always global, even if they are created inside a function.
console.log(g)
