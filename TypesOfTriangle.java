package com.ashish;

public class TypesOfTriangle {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3};
        System.out.println(triangle(nums));
    }

    static String triangle(int[] nums) {
        if (nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[1] + nums[2] <= nums[0]) {
            return "none";
        }
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            return "isosceles";
        }

        return "scalene";
    }
}
