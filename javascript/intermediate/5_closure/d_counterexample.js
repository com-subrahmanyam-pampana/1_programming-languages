// Initiate counter
let counter = 0;
// Function to increment counter
function add() {
  counter += 1;
}
// Call add() 3 times
add();
add();
add();
// The counter should now be 3
console.log(counter)
//There some problem with above Any methods can modify the counter

function someRandomMethod(){
    counter=10;
}
someRandomMethod();
console.log(counter)

const add2 = (function () {
    let counter = 0;
    return function () {counter += 1; return counter}
  })();
  
  c1=add2();
  console.log(c1)
  c2=add2();
  console.log(c2)
  const c3=add2();
  console.log(c3)
  
  // the counter is now 3
  //The "wonderful" part is that it can access the counter in the parent scope.

//This is called a JavaScript closure. It makes it possible for a function to have "private" variables.

