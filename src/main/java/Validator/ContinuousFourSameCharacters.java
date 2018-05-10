package Validator;

public class ContinuousFourSameCharacters extends RomanNumberValidator {

    @Override
    public boolean isValid(String romanNumber) {
        return !(romanNumber.matches(".*(\\w)\\1{3,}.*"));
    }
}

