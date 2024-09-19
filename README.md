# Technical Assessment Java

### General
Write a function as described below and test scenarios to test its validity.

### Details
Write a function that finds missing number in array:
 - Given array of sequent numbers 0,1,2,3...N with missing member;
 - Function finds a first missing number occurrence in the sequence.

### Solution
The main idea is to calculate the expected sum of the sequence and compare it with the 
actual sum of the array elements. If exactly one number is missing, this comparison will 
correctly identify it.

In case of an error, such as:
 - the array is `null`,
 - the array is empty,
 - the array contains only a single element,
 - the sequence contains too many missing numbers (invalid range),
 - there is no missing number in the sequence,  

the function will return `-1`.