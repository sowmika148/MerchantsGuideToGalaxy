package Validator;

public class ContinuousV extends RomanNumberValidator {

    @Override
    public boolean isValid(String romanNumber) {
        return !(romanNumber.matches("(\\w)*VV(\\w)*"));
    }
}
