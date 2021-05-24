package com.qa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.oprations.CalculatorTask;

public class CalculatorTaskTest {

@Test
public void addTest() {
	 int result = CalculatorTask.add(10,3);
	 
//	  expactation, actual;	  
	  assertEquals(13,result);
	}
@Test

public void multiTest() {
	 int result2 = CalculatorTask.multiplication(10,30);
	 
//	  expactation, actual;	  
	  assertEquals(300,result2);
	}
@Test
public void subTest() {
	 int result3 = CalculatorTask.subtraction(30,10);
	 
//	  expactation, actual;	  
	  assertEquals(20,result3);
	  
	  
	}
@Test
public void diviTest() {
	 int result4 = CalculatorTask.division(30,10);
	 
//	  expactation, actual;	  
	  assertEquals(3,result4);
	}



}



