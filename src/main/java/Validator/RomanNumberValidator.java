package Validator;

import java.util.Arrays;
import java.util.List;

public abstract class RomanNumberValidator {

    public abstract boolean isValid(String romanNumber);

    private static List<RomanNumberValidator> getRules() {
        return Arrays.asList(new ContinuousD(),
                new ContinuousL(),
                new ContinuousV(),
                new ContinuousFourSameCharacters());
    }

    static boolean isValidRomanNumber(String romanNumber) {
        for (RomanNumberValidator romanNumberValidator : RomanNumberValidator.getRules()) {
            if (!romanNumberValidator.isValid(romanNumber))
                return false;
        }
        return true;
    }
}
