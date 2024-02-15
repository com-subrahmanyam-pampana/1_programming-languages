
/*In side function "this" represennts the global object*/

function test(){
   console.log(this) //global
   console.log(this===global) //global
}

console.log(this===global) //false
test()