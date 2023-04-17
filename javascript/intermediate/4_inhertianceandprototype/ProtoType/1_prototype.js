/*Proto type is the property of an object*/
/*Every object in JavaScript has a built-in property, which is called its prototype.  */
let a=2;
console.log("<<<<<<Number>>>>>>>")
console.log(a.__proto__);

let b=true;
console.log("<<<<<<Number>>>>>>>")
console.log(b.__proto__);

let c=[1,2,3,4];
console.log("<<<<<<Array>>>>>>>")
console.log(c.__proto__);

let d=function(){
  console.log("Something")
}
console.log("<<<<<<Function>>>>>>>")
console.log(d.__proto__);


console.log("<<<<<<Object>>>>>>>")

const e = {
  city: "Madrid",
  greet() {
    console.log(`Greetings from ${this.city}`);
  },
};
console.log(e.__proto__);


///Another way to get Prototype
console.log("<<<<getPrototypeOf>>>")
console.log(Object.getPrototypeOf(e)); 