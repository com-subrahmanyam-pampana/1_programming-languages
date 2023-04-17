object DataTypes {
    
   def main(args:Array[String]) : Unit ={  
      test1() 
   } 

   def test1() : Unit ={  
       var a:Int=1;
       println(a)
       var b:Boolean=true;
       println(b)
       var c:Byte=1;
       println(c)
       /*For char only single quotes are allowed*/
       var d:Char='a';
       println(d)
       var e:Float=1.3;
       println(e)
       var f:Double=1.5;
       println(f)
       var g:String="Hello I am string";
       println(g)
       var h:Long=1234;
       println(h)
       var i:Short=2;
       println(i)
   } 
}