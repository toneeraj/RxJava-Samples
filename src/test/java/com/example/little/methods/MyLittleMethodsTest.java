package com.example.little.methods;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class MyLittleMethodsTest {

	Map<String, String> testPairsExpectedResult;
	Map<String, String> testPairsActualResult;
	int[] testSortExpectedResult;
	int[] testSortActualResult;
	MyLittleMethods testClass;

	@Before
	public void initialize() {
		testPairsActualResult = null;
		testClass = new MyLittleMethods();
	}

	@Test
	public void testPairs_with_two_Strings() {
		String[] input = { "code", "bug" };
		testPairsExpectedResult = ImmutableMap.of("b", "g", "c", "e");
		testPairsActualResult = testClass.pairs(input);

		assertThat(testPairsActualResult).isEqualTo(testPairsExpectedResult);
	}

	@Test
	public void testPairs_when_first_and_last_char_is_same_for_more_than_one_Strings() {
		String[] input = { "main", "moon", "main" };
		testPairsExpectedResult = ImmutableMap.of("m", "n");
		testPairsActualResult = testClass.pairs(input);

		assertThat(testPairsActualResult).isEqualTo(testPairsExpectedResult);
	}
	
	@Test
	public void testPairs_when_first_and_last_char_is_same_for_more_than_one_strings_and_additional_String_Also_present() {
		String[] input = { "main", "moon", "good", "night" };
		testPairsExpectedResult = ImmutableMap.of("m", "n", "g", "d", "n", "t");
		testPairsActualResult = testClass.pairs(input);

		assertThat(testPairsActualResult).isEqualTo(testPairsExpectedResult);
	}
	
	@Test
	public void testPairs_when_input_array_is_empty() {
		String[] input = {  };
		testPairsExpectedResult = ImmutableMap.of();
		testPairsActualResult = testClass.pairs(input);

		assertThat(testPairsActualResult).isEqualTo(testPairsExpectedResult);
	}
	
	@Test
	public void testPairs_when_input_array_is_having_strings_of_length_one_only() {
		String[] input = { "a", "b" };
		testPairsExpectedResult = ImmutableMap.of("a", "a", "b", "b");
		testPairsActualResult = testClass.pairs(input);

		assertThat(testPairsActualResult).isEqualTo(testPairsExpectedResult);
	}
	
	@Test
	public void testPairs_when_input_array_is_having_entries_With_repeated_key_but_different_values() {
		String[] input = { "are", "codes", "and", "cods" };
		testPairsExpectedResult = ImmutableMap.of("a", "d", "c", "s");
		testPairsActualResult = testClass.pairs(input);

		assertThat(testPairsActualResult).isEqualTo(testPairsExpectedResult);
	}
	
	@Test
	public void testPairs_when_input_array_is_having_more_than_one_entry_and_each_correspond_to_unique_key() {
		String[] input = { "apple", "banana", "tea", "coffee" };
		testPairsExpectedResult = ImmutableMap.of("a", "e", "b", "a", "c", "e", "t", "a");
		testPairsActualResult = testClass.pairs(input);

		assertThat(testPairsActualResult).isEqualTo(testPairsExpectedResult);
	}
	
	@Test
	public void testSort_when_input_is_empty() {
		int[] input = {};
		testSortExpectedResult = new int[]{};
		testSortActualResult = testClass.sort(input);
		
		assertThat(testSortActualResult).isEqualTo(testSortExpectedResult);
	}
	
	@Test
	public void testSort_when_one_input() {
		int[] input = {1};
		testSortExpectedResult = new int[]{1};
		testSortActualResult = testClass.sort(input);
		
		assertThat(testSortActualResult).isEqualTo(testSortExpectedResult);
	}
	
	@Test
	public void testSort_when_input_having_two_duplicate_value() {
		int[] input = {1, 1};
		testSortExpectedResult = new int[]{1};
		testSortActualResult = testClass.sort(input);
		
		assertThat(testSortActualResult).isEqualTo(testSortExpectedResult);
	}
	
	@Test
	public void testSort_when_input_having_two_distinct_values() {
		int[] input = {1, 2};
		testSortExpectedResult = new int[]{1, 2};
		testSortActualResult = testClass.sort(input);
		
		assertThat(testSortActualResult).isEqualTo(testSortExpectedResult);
	}
	
	@Test
	public void testSort_when_input_having_two_distinct_values_and_one_Duplicate() {
		int[] input = {1, 2, 2};
		testSortExpectedResult = new int[]{1, 2};
		testSortActualResult = testClass.sort(input);
		
		assertThat(testSortActualResult).isEqualTo(testSortExpectedResult);
	}
	
	@Test
	public void testSort_when_input_having_three_distinct_values() {
		int[] input = {3, 2, 1};
		testSortExpectedResult = new int[]{1, 2, 3};
		testSortActualResult = testClass.sort(input);
		
		assertThat(testSortActualResult).isEqualTo(testSortExpectedResult);
	}

}
