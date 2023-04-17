


const myNumberArray=[1,2,3];
//ts considers this as an array of numbers
//Now you can not change the type
myNumberArray.push(4);
myNumberArray.push("5");//gives an error because we can not push strings
