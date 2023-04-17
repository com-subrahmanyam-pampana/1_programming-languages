/*
The prototype is itself an object, so the prototype will have its own prototype, making what's called a prototype chain. The chain ends when we reach a prototype that has null for its own prototype.
*/

const e = {
  city: "Madrid",
  greet() {
    console.log(`Greetings from ${this.city}`);
  },
};
console.log(e.__proto__.__proto__);