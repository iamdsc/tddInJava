package com.iamdsc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateISBNtest {

	@Test
	void checkValid10DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140177396");
		assertTrue(result, "The first value");
		result = validator.checkISBN("0140449116");
		assertTrue(result, "The second value");
	}

	@Test
	void checkValid13DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9781853260087");
		assertTrue(result);
	}
		
	@Test
	void tenDigitISBNsEndingWithXValid() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("012000030X");
		assertTrue(result);
	}
	
	@Test
	void checkInvalid10digitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140177397");
		assertFalse(result);
	}
	
	@Test
	void checkInvalid13DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9781853260086");
		assertFalse(result);
	}
	
	@Test
	void nineDigitISBNsNotAllowed() throws NumberFormatException {
	    Assertions.assertThrows(NumberFormatException.class, () -> {
	    	ValidateISBN validator = new ValidateISBN();
			validator.checkISBN("123456789");
	    });
	}
	
	@Test
	void nonNumericISBNsNotAllowed() throws NumberFormatException {
	    Assertions.assertThrows(NumberFormatException.class, () -> {
	    	ValidateISBN validator = new ValidateISBN();
			validator.checkISBN("helloworld");
	    });
	}	
	


	
}
