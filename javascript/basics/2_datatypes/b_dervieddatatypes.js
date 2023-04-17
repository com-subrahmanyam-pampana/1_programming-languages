
/*
Array	
Object	
RegExp
Maps
Sets	
*/

console.log("<<<<<<<Array>>>>>>");
const a=[1,2,3,4];
console.log(a);
//Another way of defining an array
const b=new Array(1,2,3,4);//using new keyword
console.log(b);


console.log("<<<<<<<Object>>>>>>")
const ob1={
    "firstName":"subbu",
    "lastName":"pampa",
    "rNumber":1
}
console.log(ob1)
const ob2=new Object(); //using new keyword
console.log(ob2)


console.log("<<<<<<<Map>>>>>>")
const map1=new Map();
console.log(map1)
map1.set(1,"One")
map1.set(2,"Two")
console.log(map1)


console.log("<<<<<<<Set>>>>>>")
const set2=new Set();
set2.add(1)
set2.add("apple");
set2.add("apple");
set2.add(89)
console.log(set2)

console.log("<<<<<Regular expressions>>>>")
const re1 = new RegExp('ab+c');
const re2 = /ab+c/;
