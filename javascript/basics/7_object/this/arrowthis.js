//Arrow functions are special: they don’t have their “own” this. If we reference this from such a function, it’s taken from the outer “normal” function.

//For instance, here arrow() uses this from the outer user.sayHi() method:

let user = {
    firstName: "subbu",
    sayHi() {
      let arrow = () => alert(this.firstName);
      arrow();
    }
  };
  
  user.sayHi(); // subbu