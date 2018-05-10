import Inputs.IntergalacticNumbers;
import Inputs.IntergalacticQuestions;
import Inputs.IntergalacticUnits;

import java.util.ArrayList;
import java.util.List;

class InputProcessor {

    String[] input;

    InputProcessor(String[] input) {
        this.input = input;
    }

    OutputWrapper processInput() {
        List<String> intergalacticNumbersLines = new ArrayList<>();
        List<String> intergalacticUnitsLines = new ArrayList<>();
        List<String> intergalacticQuestionsLines = new ArrayList<>();
        for (String line : input) {
            if (line.matches("([A-Za-z])* is (A-Z)")) {
                intergalacticNumbersLines.add(line);
            }
            else if(line.matches("([A-Za-z]\\s)* is [0-9]* Credits")){
                intergalacticUnitsLines.add(line);
            }
            else if(line.matches("([A-Za-z]\\s)* ?")){
                intergalacticQuestionsLines.add(line);
            }
        }
        return createOutput(intergalacticNumbersLines, intergalacticUnitsLines, intergalacticQuestionsLines);
    }

    private OutputWrapper createOutput(List<String> intergalacticNumbersLines,
                                       List<String> intergalacticUnitsLines,
                                       List<String> intergalacticQuestionsLines ) {
        IntergalacticNumbers intergalacticNumbers = new IntergalacticNumbers(intergalacticNumbersLines);
        IntergalacticUnits intergalacticUnits = new IntergalacticUnits(intergalacticUnitsLines, intergalacticNumbers);
        IntergalacticQuestions intergalacticQuestions = new IntergalacticQuestions(intergalacticQuestionsLines);
        return new OutputWrapper(intergalacticNumbers, intergalacticUnits, intergalacticQuestions);
    }
}
