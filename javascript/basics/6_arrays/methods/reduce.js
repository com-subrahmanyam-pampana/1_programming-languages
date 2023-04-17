let numbers1 = [0, 1, 2, 3, 4];
var sum = numbers1.reduce(myFunction);
function myFunction(total, value, index, array) {
  return total + value;
}
console.log(sum)
