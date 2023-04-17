
async function addTwoNumbers(a,b) {
   return  await a+b;
}
//await works inside async function only
async function sum(){
   const result =await  addTwoNumbers(1,2);
   console.log(result);
}
sum();