package Validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContinuousVTest {
    @Test
    public void shouldReturnTrueWhenVVIsNotSubString(){
        assertTrue(new ContinuousV().isValid("VI"));
    }

    @Test
    public void shouldReturnFalseWhenVVIsSubString(){
        assertFalse(new ContinuousV().isValid("VVI"));
    }

}