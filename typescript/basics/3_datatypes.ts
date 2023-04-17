

let firstName: string = "Dylan";
let age: number = 12;
let isValidAge:boolean=false;

//TypeScript has special types that may not refer to any specific type of data.

let myvar56:any;
myvar56=true;
myvar56="ty";

//Un know data type
let w: unknown = 1;
w = "string"; // no error

//never datat type
//never is rarely used, especially by itself, its primary use is in advanced generics.

let mynevervar: never = true; // Error: Type 'boolean' is not assignable to type 'never'.

//undefinede
let y56: undefined = undefined;

//null data type
let z45: null = null;

//Union data type
//It can be used when value can be more than single data type
//means It can be a string or a number.We use "|",OR symbol

function printStatus(code: string|number){
    console.log(`Status ${code}`)
}


