let numbers1 = [1, 1, 1, 1, 1];
let numbers2 = numbers1.map(myFunction);
function myFunction(value, index, array) {
  return value +1;
}
console.log(numbers2)


