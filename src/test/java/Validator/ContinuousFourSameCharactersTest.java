package Validator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContinuousFourSameCharactersTest {

    @Test
    public void shouldReturnTrueWhenThereIsNoCharacterRepeatingContinuouslyMoreThan3Times() {
        assertTrue(new ContinuousFourSameCharacters().isValid("DDD"));
    }

    @Test
    public void shouldReturnFalseWhenThereIsCharacterRepeatingContinuouslyMoreThan3Times() {
        assertFalse(new ContinuousFourSameCharacters().isValid("IAXXXXAI"));
    }

}