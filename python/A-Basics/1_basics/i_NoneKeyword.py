
#None is a Python keyword that means "nothing." 
# None is known as nil, null, or undefined in different computer languages.
def noneKeywordTest():
    print("<<<<None keyword>>>>>")
    print(None==0)
    print(None==False)
    A=None;
    B=None;
    print(A==B)
noneKeywordTest()

#This program has a function with_return that performs multiple operations and 
# contains a return expression. As a result, if we display a number, 
# we get None, which is given by default when there is no return statement. 
def getResult():
    if 2>3:
        return True;
result= getResult()
print(result);       