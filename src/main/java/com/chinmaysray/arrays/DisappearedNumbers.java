package com.chinmaysray.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

	Find all the elements of [1, n] inclusive that do not appear in this array.
	
	Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
	
	Example:
	
	Input:
	[4,3,2,7,8,2,3,1]
	
	Output:
	[5,6]
	
 * @author Chinmay S Ray
 *
 */
public class DisappearedNumbers {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        
		List<Integer> missingNums = new ArrayList<Integer>();
		
		int[] H = new int[nums.length+1];
		Arrays.fill(H, 0);
		
		for (int i = 0; i < nums.length; i++) {
			H[nums[i]]++;
		}
		
		for (int i = 1; i < H.length; i++) {
			if(H[i] == 0) {
				missingNums.add(i);
			}
		}
		return missingNums;
    }
	
	public static void main(String[] args) {
		DisappearedNumbers numbers = new DisappearedNumbers();
		int[] intArr = {4,3,2,7,8,2,3,1};
				
		List<Integer> list  = numbers.findDisappearedNumbers(intArr);
		
		System.out.println(list);
	}

}
