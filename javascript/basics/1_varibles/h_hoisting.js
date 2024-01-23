
/*
Hoisting is a JavaScript mechanism where variables and function 
declarations are moved to the top 
of their scope before code execution
 */

/*
The hoisting mechanism only moves the declaration. 
The assignments are left in place.
*/
console.log(h);///Prints undefiend
var h="I am var hoisting";

///Gives error "Cannot access 'x' before initialization"
console.log(x);
let x="I am var hoisting";

z=2;
console.log(z)
var z;