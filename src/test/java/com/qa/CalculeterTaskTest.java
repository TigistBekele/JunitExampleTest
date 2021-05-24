package com.qa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.oprations.CalculetorTask;

public class CalculeterTaskTest {

@Test
public void addTest() {
	 int result = CalculetorTask.add(10,3);
	 
//	  expactation, actual;	  
	  assertEquals(13,result);
	}
@Test

public void multiTest() {
	 int result2 = CalculetorTask.multiplication(10,30);
	 
//	  expactation, actual;	  
	  assertEquals(300,result2);
	}
@Test
public void subTest() {
	 int result3 = CalculetorTask.subtraction(30,10);
	 
//	  expactation, actual;	  
	  assertEquals(20,result3);
	  
	  
	}
@Test
public void diviTest() {
	 int result4 = CalculetorTask.division(30,10);
	 
//	  expactation, actual;	  
	  assertEquals(3,result4);
	}



}



