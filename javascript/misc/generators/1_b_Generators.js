
function* generateSeqOfEvenNumbers(){
    yield 2;
}
let result=generateSeqOfEvenNumbers();
//generateSeqOfEvenNumbers  produce first even number 2
console.log(result.next());
//{value: 2, done: false} //false because may be Generators gives another number
console.log(result.next());
//{value: undefined, done: true} done=true because generator stops giving furter


