/*
LeetCode Problem #217: Contains Duplicate

Question:
Given an integer array nums, return true if any value appears
at least twice in the array, and return false if every element is distinct.

Example:
Input: nums = [1,2,3,1]
Output: true
*/


package leetcode;

import java.util.HashSet;



public class ContainsDuplicate {

	public static boolean containsDuplicate(int []nums) {
		
		HashSet<Integer> set = new HashSet();
		
		for(int num : nums) {
			if(set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false ;
	}
	public static void main(String[]args) {
		int [] nums = {1,2,5,7,1};
		System.out.println("Contains Duplicate: " + containsDuplicate(nums));
	}
}
