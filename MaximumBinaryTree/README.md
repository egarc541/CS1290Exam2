# 654. Maximum Binary Tree
LeetCode Problems\
CS1290 Exam 2 

# Problem 

Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

# Approach
For this problem I had to used two different types of approaches which consist of IDEAL and Duke 7 Steps. I tested both approaches finding out that IDEAL is not as suitable like Duke due to taking the extra step to really understand the problem. I used Duke 7 steps and found out that it was easier to track down the problem in paper. My first step was try to solve the small portions of the problem which consisted in drawing on paper a binary tree with a set of values that did not duplicate.
I draw an array with the example given first using the tree traverse has and then by lookng from left to right checking the 
maximum value inside and setting it to the root on paper. Next step to be taken was implementing it on code which I had some trouble understanding until I notice that it could be done by setting a value less than the root to the right and to the left
and the max from a different method.
