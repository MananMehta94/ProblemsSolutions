package com.manan.problems.solutions;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array">RemoveDuplicatesFromSortedList</a>
 * */

public class RemoveDuplicatesFromSortedList {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0; i< nums.length ; i++){
            if(nums[i]!=nums[j]){
                j+=1;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
