
//Variables created without a declaration keyword (var, let, or const) are always global, 
// even if they are created inside a function.
function test2(){
    var t1=20;
    g=45;
}
test2()
console.log(g) /*Works but you need to call the function*/ 
console.log(t1) /*Gives an error*/