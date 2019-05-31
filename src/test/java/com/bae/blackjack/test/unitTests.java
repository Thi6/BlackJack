package com.bae.blackjack.test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack.mainapp.BlackJack;

public class unitTests {
	static BlackJack blackjack;
	
	@BeforeClass
	public static void setup() {
		blackjack = new BlackJack();
	}
	
	@Test
	public void test1() {
		assertEquals(-1, blackjack.play(0,0));
	}
	
	@Test
	public void test2() {
		assertEquals(-1, blackjack.play(0, 21));
	}
	
	@Test
	public void test3() {
		assertEquals(-1, blackjack.play(21, 0));
	}
	
	@Test
	public void test4() {
		assertEquals(10, blackjack.play(10, 10));
	}
	
	@Test
	public void test5() {
		assertEquals(21, blackjack.play(30, 21));
	}
	
	@Test
	public void test6() {
		assertEquals(-1, blackjack.play(31, 22));
	}
	
	@Test
	public void test7() {
		assertEquals(0, blackjack.play(30, 22));
	}
	

	@Test
	public void testtwist() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			myList.add(blackjack.twist());
		}
		for (int a : myList) {
			if (a>0 && a<12) {
				continue;
			} else {
				fail("Expected value between 1 and 11 but got " + a);
			}
		}
		assertTrue(true);
	}
	
	
}

