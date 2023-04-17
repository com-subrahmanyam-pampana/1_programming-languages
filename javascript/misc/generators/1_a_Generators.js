
function* generateSeqOfEvenNumbers(){
    yield 2;
}
let result=generateSeqOfEvenNumbers();
//generateSeqOfEvenNumbers  produce first even number 2
console.log(result.next());
//{value: 2, done: false} //false indicate that generateSeqOfEvenNumbers may give you next numer
//or it may not

