

let x={"myname":"Trump"};
/*Method 1 */
var size = Object.keys(x).length;
console.log(size)

/*Method 2 */
//Get  array of the object properties and use length of array
const propOwn = Object.getOwnPropertyNames(x);
console.log(propOwn)
console.log(propOwn.length)

