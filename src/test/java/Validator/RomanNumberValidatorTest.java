package Validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberValidatorTest {

    @Test
    public void shouldReturnTrueWhenXXXIXIsPassed(){
        assertTrue(RomanNumberValidator.isValidRomanNumber("XXIX"));
    }

    @Test
    public void shouldReturnTrueWhenXXXXIXIsPassed(){
        assertTrue(RomanNumberValidator.isValidRomanNumber("XXXIX"));
    }

    @Test
    public void shouldReturnFalseIfDDIsPresentInRomanNumber(){
        assertFalse(RomanNumberValidator.isValidRomanNumber("LDD"));
    }

}