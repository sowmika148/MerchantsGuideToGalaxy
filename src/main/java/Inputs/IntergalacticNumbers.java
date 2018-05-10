package Inputs;

import java.util.HashMap;
import java.util.List;

public class IntergalacticNumbers {

    List<String> lines;
    HashMap<String, Integer> intergalacticNumbersMap;

    public IntergalacticNumbers(List<String> lines) {
        this.lines = lines;
        processIntergalacticNumberLines();
    }

    private void processIntergalacticNumberLines() {
        for (String line : lines) {
            intergalacticNumbersMap.put(line.split("\\s")[0],
                    RomanNumber.valueOf(line.split("\\s")[2]).getValue());
        }
    }
}
