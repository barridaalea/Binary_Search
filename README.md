# Laboratory Activity: Recursion
# Description 
Recursive binary search program that accepts user input,
sorts the array, and prints low, high, and mid for every recursive
call so the shrinking search interval can be observed until the
target is found or the interval becomes empty.
# Programming Language
Java
# How to compile and run
javac Binary_search.java
java Binary_search
# Sample input and output
Enter number of elements: 7
Enter 7 elements:
40 10 70 20 50 30 60
Sorted array: 10 20 30 40 50 60 70
Enter target value: 50
binarySearch(0, 6, 50)
  mid = 3, array[mid] = 40
binarySearch(4, 6, 50)
  mid = 5, array[mid] = 60
binarySearch(4, 4, 50)
  mid = 4, array[mid] = 50
Target found.
Index: 4
