

/*The await operator is used to wait for a Promise and get 
its fulfillment value. 
It can only be used inside 
an async function or at the top level of a module. */
async function addTwoNumbers(a,b) {
   return  await a+b;
}
//await works inside async function only
async function sum(){
   const result =await  addTwoNumbers(1,2);
   console.log(result);
}
sum();