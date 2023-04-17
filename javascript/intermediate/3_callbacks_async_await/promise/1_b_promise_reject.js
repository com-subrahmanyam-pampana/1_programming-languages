
let promise =new Promise(function(resolve,reject){
  //Executor
  setTimeout(()=>reject("OK"),2000);
})

success=function(){
    console.log("Promiss success")
}
fail=function(){
    console.log("Promise Fail")
}
promise.then(success).catch(fail);



