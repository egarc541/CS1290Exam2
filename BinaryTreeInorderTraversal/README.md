# 94. Binary Tree Inorder Traversal
LeetCode Problem\
CS1290 Exam 2

For this problem I had to used the IDEAL and Duke 7 steps approaches to solve it.
In order to make IDEAL work with this problem I had to first a Identity what the 
problem was really asking, which is, you have a Binary tree you will have to 
return the inorder traversal of its nodes values. After identifying the problem
I had to ensure to define the type. After understand what it was really asking
I found only solution that took the example and made it possible to use recursion
in this problem.  The code first reads the tree from left to right to ensure that 
it visits every node and gets the value in the correct way. It will check the top 
node check first the left node/child , if there is a value it will check left first
put the value on the list if no values to the left or to the right it will go back
to the top and it will do the same algorithm of check nodes to the left, setting
the value on the list or stack and checking for the right node. For the Duke 7 step
approach problem was the same procedure. At the end, I found that IDEAL was better 
for this type of problem due to having a simpler way of approaching it using recursion.
