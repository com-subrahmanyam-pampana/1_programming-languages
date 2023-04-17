  /**
   You can observe the object value is changed but not the primitives.
   */
  /*<<<<<Primitive>>>>> */
  console.log("<<<<Primitive>>>>>>")
  let x = 10;
  primitiveMutator(x);
  function primitiveMutator(val) {
    val = val + 1;
  }
  console.log(x); // 10
  //x value is not changed because it is passed by value

   /*<<<<<Object Mutator >>>>> */
  console.log("<<<<Object>>>>>>")
  let obj = { count: 1 };
  objectMutator(obj);
  function objectMutator(val) {
    val.count = val.count + 1;
  }
  console.log(obj); // {count: 2}

  console.log("<<<<Object>>>>>>")
  let arr = [1];
  arrMutator(arr);
  function arrMutator(val) {
    val.push(2);
  }
  console.log(arr); // [1,2]



  