package com.example.little.methods;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author SinNe002
 *
 */
public class MyLittleMethods {

	/**
	 * * https://codingbat.com/prob/p126332
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

}
