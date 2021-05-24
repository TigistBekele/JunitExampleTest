package com.qa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JunitExampleTest {

//@BeforeAll,@AfterAll - these methods must be static!
	@Test

	public void testMethod() {

		System.out.println("hello world");

	}
//	@BeforeAll
//	
//	public static void start() {
//		System.out.println("starts of tests\n");
//	}

	@BeforeEach
	public void beforestart() {
		System.out.println("test of tests\n");
	}

	@AfterAll

	public static void ends() {
		System.out.println("ends of tests");
	}

	
	
	@Test
	@Disabled
	public void testMethod2() {

		System.out.println("hello world test2\n");

	}
}
