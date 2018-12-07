# 951. Flip Equivalent Binary Trees
LeetCode Problems\
CS1290 Exam2

# Problem 
For a binary tree T, we can define a flip operation as follows: choose any node, and swap the left and right child subtrees.
A binary tree X is flip equivalent to a binary tree Y if and only if we can make X equal to Y after some number of flip operations.
Write a function that determines whether two binary trees are flip equivalent.  The trees are given by root nodes root1 and root2.

# Approach
For this problem I had to use two approaches which are IDEAL and Duke 7 steps. On each of the approaches I had to determine which one was
more situable to find a simpler and less complex solution. For this problem I found that even though the solution I found is simpler 
due to using recursion, I found that Duke 7 step was better to use due to all steps you can take to ensure you get a solution. My first s
step use was solving small parts of the problem by drawing a Binary Tree on a paper and redraw it on the pattern but mirrorwise. I had to
understand the pattern to ensure on paper it made sense moving the root and their childs on the some position of the tree but different 
sides. First step was making sure both root's had the same values and if was the case returning true otherwise if the values were not 
equal returning false. If the root's were not equivalent the last step to understand it was flipping each value. For the duke 7 steps 
I had to code it already knowing the concept of the problem and also testing if the final outcome was equivalent.
