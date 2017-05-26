package com.courseTest.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {

	@Test(timeout=200)
	public void testPerformance() {
		for(int  i=0;i<5000;i++){
			Arrays.sort(new int[]{i,i-1,i+1});
		}
	}

}
