package Validator;

public class ContinuousD extends RomanNumberValidator {

    @Override
    public boolean isValid(String romanNumber) {
        return !(romanNumber.matches("(\\w)*DD(\\w)*"));
    }
}
