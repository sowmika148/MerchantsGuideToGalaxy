package Inputs;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class IntergalacticNumbers {

    HashMap<String, RomanNumber> intergalacticNumbersMap;

    public IntergalacticNumbers(List<String> lines) {
        intergalacticNumbersMap = new HashMap<>();
        processIntergalacticNumberLines(lines);
    }

    private void processIntergalacticNumberLines(List<String> lines) {
        for (String line : lines) {
            intergalacticNumbersMap.put(line.split("\\s")[0],
                    RomanNumber.valueOf(line.split("\\s")[2]));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntergalacticNumbers that = (IntergalacticNumbers) o;
        return Objects.equals(intergalacticNumbersMap, that.intergalacticNumbersMap);
    }

    @Override
    public int hashCode() {

        return Objects.hash(intergalacticNumbersMap);
    }
}
