package com.chinmaysray.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

	Find all the elements that appear twice in this array.
	
	Could you do it without extra space and in O(n) runtime?
	
	Example:
	Input:
	[4,3,2,7,8,2,3,1]
	
	Output:
	[2,3]
	
 * @author Chinmay S Ray
 *
 */
public class DuplicatesInArray {
	
	public List<Integer> findDuplicates(int[] nums) {
        
		List<Integer> dupes = new ArrayList<Integer>();
		
		int[] H = new int[nums.length+1];
		Arrays.fill(H, 0);
		
		for (int i = 0; i < nums.length; i++) {
			H[nums[i]]++;
		}
		
		for (int i = 1; i < H.length; i++) {
			if(H[i] > 1) {
				dupes.add(i);
			}
		}
		return dupes;
    }
	
	public static void main(String[] args) {
		DuplicatesInArray numbers = new DuplicatesInArray();
		int[] intArr = {4,3,2,7,8,2,3,1};
				
		List<Integer> list  = numbers.findDuplicates(intArr);
		
		System.out.println(list);
	}

}
