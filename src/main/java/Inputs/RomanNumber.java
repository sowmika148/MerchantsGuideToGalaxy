package Inputs;

import Validator.RomanNumberValidator;

public enum RomanNumber {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500);

    private int value;

    RomanNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int getValue(String romanNumber){
        if(!RomanNumberValidator.isValidRomanNumber(romanNumber))
            return 0;
        char[] romanLetters = romanNumber.toCharArray();
        int value = 0;

        for (int i=0; i<romanNumber.length(); i++)
        {
            RomanNumber romanLetter1 = RomanNumber.valueOf(Character.toString(romanLetters[i]));
            int value1 = romanLetter1.value;
            if (i+1 < romanNumber.length())
            {
                RomanNumber romanLetter2 = RomanNumber.valueOf(Character.toString(romanLetters[i+1]));
                int value2 = romanLetter2.value;
                if (value1 >= value2)
                {
                    value = value + value1;
                }
                else
                {
                    value = value + value2 - value1;
                    i++;
                }
            }
            else
            {
                value = value + value1;
                i++;
            }
        }
        return value;
    }
}
