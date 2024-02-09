//Program to check leap year

year = 2022;
x = (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);
console.log(x);
