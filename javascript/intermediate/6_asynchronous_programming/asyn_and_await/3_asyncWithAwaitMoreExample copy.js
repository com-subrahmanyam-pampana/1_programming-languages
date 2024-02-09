

const result =  addTwoNumbers(1,2);

async function addTwoNumbers(a,b) {
    let data1= await getUserFromDatabase();
    let data2=await addEventInDatabase();
}

async function  getUserFromDatabase(){
   return {'userId':1};
}

async function  addEventInDatabase(){
  console.log("Event added")
}