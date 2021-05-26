package com.qa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.oprations.Blackjack;

public class BlackjackTest {

	@Test
	public void blackjackTest1() {
		int result1 = Blackjack.play(22, 22);
		
		 assertEquals(0,result1);
	}

	@Test
	public void blackjackTest2() 
	{
		int result2 = Blackjack.play(22, 12);
		
		 assertEquals(12,result2);
	}

	@Test
	public void blackjackTest3() {
		int result3 = Blackjack.play(10, 22);
		
		 assertEquals(10,result3);
	}
git 

	
	
	
}
