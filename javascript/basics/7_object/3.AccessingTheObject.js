
/*
The syntax for accessing the property of an object is:
objectName.property      // person.age
or
objectName["property"]   // person["age"]
or
objectName[expression]   // x = "age"; person[x]
*/
let x={"name":"Subbu","age":28}
let key="age"
console.log(x.age);
console.log(x["age"]);
console.log(x[key])
