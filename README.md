# find-a-valley

king saud university 
CSC311 algorithm design 
First Semester 1443

phase one 

Problem 

Suppose that you are interested in collecting rainwater to augment a towns water supply. You
know that the water accumulates in valleys (a low altitude point between two higher altitude
points), since rain rolls downhill after falling on high points. You want to find the location of
one of these valleys, in order to set up a collection point. Assume that the altitude (elevation) is
given as a 1D array of numbers at each location (index). For example, here is a possible terrain
A=[2, 4, 5, 6, 3, 11, 12, 13, 1, 0, 7], The valleys are A[0], A[4], and A[9]
You are given an array of n elements representing the altitudes of points along the terrain, all
of which are distinct. Design an O(log n)-time algorithm that finds the location of a valley


Input Sample:

1) Input: A = 5, 10, 6, 15
The element 6 has two adjacent elements 10 and 15, both are greater than 6

2) Input: A = 10, 8, 15, 2, 23, 12, 67
Output: A[1] with value 8 OR A[3] with value 2 OR A[5]with value 12.

3)Special Cases
– if it in increasing order, the first element is a valley e.g., 1 is the valley in 1,2,3,4,5.
– if it in decreasing order, the last element is a valley e.g. 1 is the valley in 5,4,3,2,1
