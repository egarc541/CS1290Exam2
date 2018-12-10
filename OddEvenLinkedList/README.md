# 328. Odd Even Linked List
LeetCode Problems\ 
CS1290 Exam 2 

# Problem
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

# Approach
For this problem I had to use two different approaches in order to solve which are the IDEAL and Duke 7 Steps. While trying to
find a solution I used the Duke and found it work but also notice it was too much steps to solve this simple problem. I used
the IDEAL approach to first identify that the question was simple by just asking to accomodate the nodes in their respective
position in two different Linked list that hold just node from the main list and not worrying about their value inside. While 
exploring for the simpler solution I found that I just had to set the next value of the odd list into the even and act upon
writing the code and checking if the root was not null and moving each node on their respective position on the main list.
Looking back on the solution I found that it was a simple program that had to be understood first to be solve fast.
