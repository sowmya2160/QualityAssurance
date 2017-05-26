package com.courseTest.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import com.course.junit.helper.StringHelper;

public class StringHelperTest {

	@Test
	public void test() {
		
	//assertEquals("ABC","ABCD");// first-expected value , second-actual value (failure)
	//assertEquals("ABC","ABC");// first-expected value , second-actual value (success)
		StringHelper helper = new StringHelper();
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected  = "CD";
		assertEquals(expected,actual);
		
	}

}
