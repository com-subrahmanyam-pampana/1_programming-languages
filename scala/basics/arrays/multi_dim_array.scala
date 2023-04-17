/*
var arrayName = Array.ofDim[ArrayType](NoOfRows,NoOfColumns) or  
var arrayName = Array(Array(element...), Array(element...), ...)  
*/
class ArrayExample{  
    var arr = Array.ofDim[Int](2,2)          // Creating multidimensional array  
    arr(1)(0) = 15                          // Assigning value  
    def show():Unit={  
        for(i<- 0 to 1){                       // Traversing elements by using loop  
           for(j<- 0 to 1){  
                print(" "+arr(i)(j))  
            }  
            println()  
        }  
        println("Third Element = "+ arr(1)(1))        // Accessing elements by using index  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]):Unit={  
        var a = new ArrayExample()  
        a.show()                       
    }  
}  