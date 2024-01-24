
function outerFunction(){
    let myName="Subbu";
    function displayName(){
        return myName;
    }
    return displayName;
}

const myFunc=outerFunction();
let myName=myFunc();
console.log(myName)

//In other programing lang ,this won't work
//Because when compailer retured from the
// function ,all varibles are removed but
//this works in the Java Script
//This is because function will know the
// all the varibles in its scope
//This is called lexically scoped 