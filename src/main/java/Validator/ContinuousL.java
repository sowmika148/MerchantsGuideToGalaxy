package Validator;

public class ContinuousL extends RomanNumberValidator {

    @Override
    public boolean isValid(String romanNumber) {
        return !(romanNumber.matches("(\\w)*LL(\\w)*"));
    }
}
