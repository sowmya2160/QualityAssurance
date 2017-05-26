package com.courseTest.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterAnnotations {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Sowmya Lakkireddy");
	}
	
	@Before
	public void setup(){
		System.out.println("Saibersys");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}

	
	@After
	public void teardown() {
		System.out.println("Currently");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("Cybersolveit Inc");
	}
}
