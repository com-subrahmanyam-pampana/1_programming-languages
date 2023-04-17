import scala.compiletime.ops.boolean
/*
var arrayName : Array[arrayType] = new Array[arrayType](arraySize);   or  
var arrayName = new Array[arrayType](arraySize)  or  
var arrayName : Array[arrayType] = new Array(arraySize);   or  
var arrayName = Array(element1, element2 ... elementN)  
*/



object MainObject{  
    def test1():Unit={  
        var arr1 = Array(1,2,3,4,5)
        var arr2=Array("subbu","gabbu")
        var arr3=Array(false,true)
        var arr4=Array[Boolean](false,true)
        var arr5=new Array[Boolean](2)
        arr5=Array(true,false)
        println(arr1) 
        println(arr2)
        println(arr3)
        println(arr4)
        println(arr5) 
        /*Access element*/
        println(arr1(1))      
    }

     def test2():Unit={  
        println("<<<<<<<<<Iteration>>>>>>>>.")
        var arr1 = Array(1,2,3,4,5)
        for(a<-arr1){
         println(a)
        }
        arr1.foreach((elememt:Int)=>println(elememt))
    }
    def test3():Unit={
      println("<<<<<<<<<Pass Array to function>>>>>>>>.")
      var arr1 = Array[Int](1,2,3,4,5)
      printElement(arr1)
    }
    def printElement(myArray:Array[Int]):Unit={  
        for(a<-myArray){
         println(a)
        }
    }


    def main(args:Array[String]):Unit={  
        test1() 
        test2() 
        test3() 
    }  
} 