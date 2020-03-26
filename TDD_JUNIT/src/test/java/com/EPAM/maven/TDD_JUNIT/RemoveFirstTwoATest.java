package com.EPAM.maven.TDD_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirstTwoATest {
	
	/* TODO LIST
	 * 1. Only 1st Char A: ABCD => BCD - success
	 * 2. Only 2nd Char A: BACD => BCD - success
	 * 3. 1st Two Char A: AACD => CD - success
	 * 4. 1st Two Char not A: BBAA => BBAA - success
	 * 5a. 1 char: A => "" - success
	 * 5b. 1 char: B => B - success
	 * 6a. 2 char: AA => "" - success
	 * 6b. 2 char: BA => B - success
	 * 7. Empty String: "" => "" - success*/
	
	RemoveFirstTwoA removefirsttwoAtest;
	
	@BeforeEach
	void setup()
	{
		removefirsttwoAtest = new RemoveFirstTwoA();
	}

	@Test
	void testonly1stcharA() {
		assertEquals("BCD",removefirsttwoAtest.removeA("ABCD"));
	}

	@Test
	void testonly2ndcharA() {
		assertEquals("BCD",removefirsttwoAtest.removeA("BACD"));
	}
	
	@Test
	void test1sttwocharA() {
		assertEquals("CD",removefirsttwoAtest.removeA("AACD"));
	}
	
	@Test
	void test1sttwocharnotA() {
		assertEquals("BBAA",removefirsttwoAtest.removeA("BBAA"));
	}
	
	@Test
	void test5a1char() {
		assertEquals("",removefirsttwoAtest.removeA("A"));
	}
	
	@Test
	void test5b1char() {
		assertEquals("B",removefirsttwoAtest.removeA("B"));
	}
	
	@Test
	void test6a2char() {
		assertEquals("",removefirsttwoAtest.removeA("AA"));
	}
	
	@Test
	void test6b2char() {
		assertEquals("B",removefirsttwoAtest.removeA("BA"));
	}
	
	@Test
	void testemptystring() {
		assertEquals("",removefirsttwoAtest.removeA(""));
	}
}
