package Inputs;

import java.util.HashMap;
import java.util.List;

public class IntergalacticUnits {

    private List<String> lines;
    private IntergalacticNumbers intergalacticNumbers;
    private HashMap<String, Double> intergalacticUnits;

    public IntergalacticUnits(List<String> lines, IntergalacticNumbers intergalacticNumbers) {
        this.lines = lines;
        this.intergalacticNumbers = intergalacticNumbers;
        processIntergalacticUnitsLines();
    }

    private void processIntergalacticUnitsLines() {
        for (String line : lines) {
            String[] splitOnIs = line.split("is");
            String unit = splitOnIs[0].split("\\s")[splitOnIs[0].split("\\s").length - 1];
            double valueInString = Integer.parseInt(splitOnIs[1].split("\\s")[0]);
            int romanNumberValue = RomanNumber.getValue(getRomanNumber(splitOnIs));
            intergalacticUnits.put(unit, valueInString/ romanNumberValue);
        }
    }

    private String getRomanNumber(String[] words){
        StringBuilder romanNumber = new StringBuilder();
        for (String word: words) {
            romanNumber.append(intergalacticNumbers.intergalacticNumbersMap.get(word));
        }
        return romanNumber.toString();
    }
}
