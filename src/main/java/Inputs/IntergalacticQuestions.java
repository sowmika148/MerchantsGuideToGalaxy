package Inputs;

import java.util.List;

public class IntergalacticQuestions {

    private List<String> lines;
    private IntergalacticNumbers intergalacticNumbers;
    private IntergalacticUnits intergalacticUnits;


    public IntergalacticQuestions(List<String> lines,
                                  IntergalacticNumbers intergalacticNumbers,
                                  IntergalacticUnits intergalacticUnits) {
        this.lines = lines;
        this.intergalacticNumbers = intergalacticNumbers;
        this.intergalacticUnits = intergalacticUnits;
    }
}
