package Validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContinuousLTest {

    @Test
    public void shouldReturnTrueWhenLLIsNotSubString(){
        assertTrue(new ContinuousL().isValid("LD"));
    }

    @Test
    public void shouldReturnFalseWhenLLIsSubString(){
        assertFalse(new ContinuousL().isValid("LLV"));
    }

}