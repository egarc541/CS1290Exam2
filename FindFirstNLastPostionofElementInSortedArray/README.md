# 34. Find First and Last Position of Element in Sorted Array
LeetCode Problem\
CS1290 Exam 2

# Problem
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
Your algorithm's runtime complexity must be in the order of O(log n).
If the target is not found in the array, return [-1, -1].

# Approach
For this problem I had to use two different approaches to solve it. I had to use the IDEAL and the Duke 7 Step approach to 
find a solution. For this problem I used both approaches but found out doing the Duke 7 steps was making me do extra work in
order to find a situable solution. My approach was using the IDEAL approach which help me first identify the real question
inside the problem. It made define that array will be check from the 1st value to the last value in order to get the times that 
the target was inside. I explore several solutions that ensure moving in both directions and retriving the position of both. I found
more easier to retrive the location by scanning the array from the leftmost and returning the position of the indicate target.
Check the rightmost by the same and indication into the array did not had the target by retrieving the current location of the 
target.  I found that throwing an error was helpful to inform that the target was not inside the array.
