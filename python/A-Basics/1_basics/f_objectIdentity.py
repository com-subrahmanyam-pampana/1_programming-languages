#In Python, every created object identifies uniquely in Python. 
# Python provides the guaranteed that no two objects will have the same identifier. 
# The built-in id() function, is used to identify the object identifier. 

a=12;
b=a;
print("Case 1:We are assigning a to b")
print(id(a))
print(id(b))
print("a nd b's ids must be same")
a=134;
print(id(a))
# We reassign a to 134; then it referred to the new object identifier.