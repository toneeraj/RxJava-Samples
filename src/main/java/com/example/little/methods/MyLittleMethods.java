package com.example.little.methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 
 * @author SinNe002
 *
 */
public class MyLittleMethods {

	/**
	 * Source : https://codingbat.com/prob/p126332
	 * 
	 * Given an array of non-empty strings, create and return a Map<String, String>
	 * as follows: for each string add its first character as a key with its last
	 * character as the value. pairs(["code", "bug"]) → {"b": "g", "c": "e"}
	 * pairs(["man", "moon", "main"]) → {"m": "n"} pairs(["man", "moon", "good",
	 * "night"]) → {"g": "d", "m": "n", "n": "t"}
	 * 
	 * @param strings
	 * @return
	 */
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();
		for (String candidateString : strings) {
			map.put(String.valueOf(candidateString.charAt(0)),
					String.valueOf(candidateString.charAt(candidateString.length() - 1)));
		}
		return map;
	}

	/**
	 * Source : https://codingbat.com/prob/p262890
	 * Return an array that contains the sorted values from the input array with
	 * duplicates removed.
	 * 
	 * 
	 * sort([]) → [] 
	 * sort([1]) → [1] 
	 * sort([1, 1]) → [1]
	 * 
	 * @param a
	 * @return
	 */
	public int[] sort(int[] a) {
		Set<Integer> s = Arrays.stream(a).boxed().collect(Collectors.toCollection(TreeSet::new));
		int[] array = s.stream().mapToInt(Number::intValue).toArray();
		
		return array;
	}
	
	/**
	 * Suppose an array sorted in ascending order is rotated at some pivot unknown
	 * to you beforehand.
	 * 
	 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
	 * 
	 * Your job is to find the index of that pivot in this given array. Essentially, this will be the index of the least value in the given array.
	 * 
	 * The desired complexity is O (log N).
	 * 
	 * 
	 * 
	 * @param a
	 * @return
	 */
	public int findRotateIndex(int[] a) {
		return findTheSmallestNumberBetweenStartAndEndIndexOfGivenArray (a , 0 , a.length - 1);
	}
	
	//
	private int findTheSmallestNumberBetweenStartAndEndIndexOfGivenArray (int[] nums, int leftIndex, int rightIndex) {
		if (nums[leftIndex] < nums[rightIndex]) {
			return 0;
		}
		
		while (leftIndex <= rightIndex) {
			int pivot = (leftIndex + rightIndex) / 2;
			
			if (nums[pivot] > nums[pivot+1]) {
				return pivot + 1; // the least number
			}
			
			else {
				if (nums[pivot] < nums[leftIndex]) {
					rightIndex = pivot - 1;
				} else {
					leftIndex = pivot + 1;
				}
			}
		}
		
		return 0;
	}

}
