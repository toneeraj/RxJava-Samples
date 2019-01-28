package com.example.little.methods;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class MyLittleMethodsTest {

	Map<String, String> expectedResult;
	Map<String, String> actualResult;
	MyLittleMethods testClass;

	@Before
	public void initialize() {
		actualResult = null;
		testClass = new MyLittleMethods();
	}

	@Test
	public void testPairs_with_two_Strings() {
		String[] input = { "code", "bug" };
		expectedResult = ImmutableMap.of("b", "g", "c", "e");
		actualResult = testClass.pairs(input);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	public void testPairs_when_first_and_last_char_is_same_for_more_than_one_Strings() {
		String[] input = { "main", "moon", "main" };
		expectedResult = ImmutableMap.of("m", "n");
		actualResult = testClass.pairs(input);

		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void testPairs_when_first_and_last_char_is_same_for_more_than_one_strings_and_additional_String_Also_present() {
		String[] input = { "main", "moon", "good", "night" };
		expectedResult = ImmutableMap.of("m", "n", "g", "d", "n", "t");
		actualResult = testClass.pairs(input);

		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void testPairs_when_input_array_is_empty() {
		String[] input = {  };
		expectedResult = ImmutableMap.of();
		actualResult = testClass.pairs(input);

		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void testPairs_when_input_array_is_having_strings_of_length_one_only() {
		String[] input = { "a", "b" };
		expectedResult = ImmutableMap.of("a", "a", "b", "b");
		actualResult = testClass.pairs(input);

		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void testPairs_when_input_array_is_having_entries_With_repeated_key_but_different_values() {
		String[] input = { "are", "codes", "and", "cods" };
		expectedResult = ImmutableMap.of("a", "d", "c", "s");
		actualResult = testClass.pairs(input);

		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void testPairs_when_input_array_is_having_more_than_one_entry_and_each_correspond_to_unique_key() {
		String[] input = { "apple", "banana", "tea", "coffee" };
		expectedResult = ImmutableMap.of("a", "e", "b", "a", "c", "e", "t", "a");
		actualResult = testClass.pairs(input);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

}
