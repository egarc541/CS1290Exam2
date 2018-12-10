# 662. Maximum Width of Binary Tree
LeetCode Problems\
CS1290 Exam 2 

# Problem
Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.
The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.

# Approach
For this problem I had to use two approches to solve it by using two different methods which consists of IDEAL and Duke 7
steps. While using both approaches both methods work with this problem due to being simple and at the same time complex. For 
this problem the first step that I needed to be identify and at the same time solve in small instances was making sure I understood how the tree working with the maximim width. Which mean that either the left and the right side of the tree had
to be same lenght in order to determine the maximum size of the width. Exploring solution while also working on how a pattern
could be found, I notice that Depth first search work by first trying to identify the nodes that were the last on each side of 
the tree. When I started to act on my pattern I notice that I had to check for both side depths and return a value if
something was found while the calling the method.
