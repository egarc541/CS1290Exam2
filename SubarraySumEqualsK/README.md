# 560. Subarray Sum Equals K
LeetCode Problems<br>
CS1290 Exam 2 

# Problem
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum 
equals to k.

# Approach
For this approach I had to solve it using the IDEAL and Duke 7 steps. I first used the IDEAL approach due to the problem being 
simple. After trying to find it only by doing the IDEAL steps, I found that Duke 7 steps although works with more complex 
problems was more benefitial due to taking the extra step of drawing and finding the patterns in different scenarios used in 
the question example. I found it was simple by drawing and adding the values of the array on paper and then translating it to
code by adding them to a hashMap. Which would hold the values and add them depending on the integer value K. Adding the values
and then subtracting them by the K integer and also making sure they equal.
