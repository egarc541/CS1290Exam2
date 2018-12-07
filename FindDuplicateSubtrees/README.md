# 652. Find Duplicate Subtrees
LeetCode Problems\ 
CS1290 Exam 2

# Problem 
Given a binary tree, return all duplicate subtrees. For each kind of duplicate subtrees, you only need to return the root node of any one of them.

Two trees are duplicate if they have the same structure with same node values.

# Approach
For this problem I had to use the IDEAL and Duke 7 Step in order to find a solution. My first approach was using was IDEAL to 
solve it. I found out has it is a little more complex that the usual IDEAL problem and determine I had to used the Duke 7 steps. 
As the 7 steps start with working on small instances of the problem I took the first two steps by writing a tree in paper to 
understand how it could have two subtrees that are identical. I tried to understand the pattern of traversing the tree and 
making an identifier for each number or pattern that was already added to a hashMap. By steps done before I had already understood
that I had to create map that would identify each number entering and will also ensure no duplicate values or null values would 
go in by using the map library. I had to run test cases of different trees to ensures the code written was in fact return the duplciate
values.
