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
For this problem I had to used two different types of approaches which consist of IDEAL and Duke 7 Steps. I tested both approaches 
finding out that IDEAL is not as suitable has Duke due to taking the extra step to really understand the problem. I used Duke 7 
steps and found out that it was easier to track down the problem in paper. My first step was try to solve the small portions of 
the problem which consiste in drawing in paper a binary tree with a set of values
