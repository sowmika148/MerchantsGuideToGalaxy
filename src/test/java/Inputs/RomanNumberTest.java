package Inputs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

    @Test
    public void shouldReturn0WhenXXXIXIsPassed() {
        assertEquals(0, RomanNumber.getValue("XXXXIX"));
    }

    @Test
    public void shouldReturn0WhenDDIsPassed() {
        assertEquals(0, RomanNumber.getValue("DD"));
    }

    @Test
    public void shouldReturn9WhenIXIsGiven(){
        assertEquals(9, RomanNumber.getValue("IX"));
    }

    @Test
    public void shouldReturn49WhenXLIXIsGiven(){
        assertEquals(49, RomanNumber.getValue("XLIX"));
    }

    @Test
    public void shouldReturn849WhenDCCCXLIXIsGiven(){
        assertEquals(849, RomanNumber.getValue("DCCCXLIX"));
    }
}