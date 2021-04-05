package Inputs;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class IntergalacticUnits {

    private HashMap<String, Double> intergalacticUnitsMap;

    public IntergalacticUnits(List<String> lines, IntergalacticNumbers intergalacticNumbers) {
        intergalacticUnitsMap = new HashMap<>();
        processIntergalacticUnitsLines(lines, intergalacticNumbers);
    }

    private void processIntergalacticUnitsLines(List<String> lines, IntergalacticNumbers intergalacticNumbers) {
        for (String line : lines) {
            String[] splitOnIs = line.split(" is ");
            String unit = splitOnIs[0].split("\\s")[splitOnIs[0].split("\\s").length - 1];
            double valueInString = Integer.parseInt(splitOnIs[1].trim().split("\\s")[0]);
            int romanNumberValue = RomanNumber.getValue(getRomanNumber(splitOnIs[0],intergalacticNumbers));
            intergalacticUnitsMap.put(unit, valueInString / romanNumberValue);
        }
    }

    private String getRomanNumber(String words, IntergalacticNumbers intergalacticNumbers) {
        String[] numbers = words.split("\\s");
        StringBuilder romanNumber = new StringBuilder();
        for (int i = 0; i < numbers.length - 1; i++) {
            romanNumber.append(intergalacticNumbers.intergalacticNumbersMap.get(numbers[i]));
        }
        return romanNumber.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntergalacticUnits that = (IntergalacticUnits) o;
        return Objects.equals(intergalacticUnitsMap, that.intergalacticUnitsMap);
    }

    @Override
    public int hashCode() {

        return Objects.hash(intergalacticUnitsMap);
    }
}
