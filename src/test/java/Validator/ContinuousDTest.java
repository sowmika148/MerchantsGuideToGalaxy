package Validator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContinuousDTest {

    @Test
    public void shouldReturnTrueWhenDDIsNotSubString() {
        assertTrue(new ContinuousD().isValid("DL"));
    }

    @Test
    public void shouldReturnFalseWhenDDIsSubString() {
        assertFalse(new ContinuousD().isValid("DDV"));
    }
}