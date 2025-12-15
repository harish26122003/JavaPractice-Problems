/*
LeetCode Problem #1: Two Sum

Question:
Given an array of integers nums and an integer target,
return the indexes of the two numbers such that they add up to the target.

Each input will have exactly one solution, and the same element
may not be used twice.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Explanation:
nums[0] + nums[1] = 2 + 7 = 9

Constraints:
- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- Only one valid answer exists.
*/


package leetcode;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{ map.get(diff), i };
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // Not found case
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 13;

        int[] result = twoSum(nums, target);

        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
}
