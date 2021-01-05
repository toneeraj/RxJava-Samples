package com.example.librarymethods;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RangeForDoubleTest {


    @Test
    public void test_lowest_range() {
	RangeForDouble rangeForDouble = new RangeForDouble();
	boolean expectedResult = true;
	
	
	
	assertThat(rangeForDouble.amIInRange(.001d)).isEqualTo(expectedResult);
    }
    
    @Test
    public void test_max_range() {
	RangeForDouble rangeForDouble = new RangeForDouble();
	boolean expectedResult = true;
	
	
	
	assertThat(rangeForDouble.amIInRange(999.999d)).isEqualTo(expectedResult);
    }

}
