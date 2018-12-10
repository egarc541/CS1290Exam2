# 938. Range Sum of BST 
LeetCode Problems\ 
CS1290 Exam 2

# Problem
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
The binary search tree is guaranteed to have unique values.

# Approach
For this problem I had to use two different methods in order to find a solution. The first approach used was the IDEAL which
I notice that usually does work with simpler problems but in this case I had to use an extra step in order to really
understand the real solution with the Duke 7 steps. I first had understand that nodes had to have a value in order to add the
range between L and R locations of the BST. I had to understand the pattern that each node was going to be added after a
value was found in the BST. While taking the step of doing the code I understood it worked better with a nested loop by
checking the values and checking the positions of the nodes and keep on calling the method. By running the examples in code
as tests I found that the depth search worked in the problem.
