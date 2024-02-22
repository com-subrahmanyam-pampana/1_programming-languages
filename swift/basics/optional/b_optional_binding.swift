/*
if let <#constantName#> = <#someOptional#> {
   <#statements#>
}
*/

var environment:String?;
print(environment) //prints nil

/*
You can use an if statement to find out whether an optional contains a value by comparing the optional against nil. 
You perform this comparison with the “equal to” operator (==) or the “not equal to” operator (!=).
If an optional has a value, it’s considered as “not equal to” nil:
*/

if let x:Any = environment{
   print(x)
}
else{
   print("environment is a optional value")
}
