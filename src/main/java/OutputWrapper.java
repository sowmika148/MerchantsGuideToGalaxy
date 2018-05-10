import Inputs.IntergalacticNumbers;
import Inputs.IntergalacticQuestions;
import Inputs.IntergalacticUnits;

public class OutputWrapper {

    IntergalacticNumbers intergalacticNumbers;
    IntergalacticUnits intergalacticUnits;
    IntergalacticQuestions intergalacticQuestions;

    public OutputWrapper(IntergalacticNumbers intergalacticNumbers,
                         IntergalacticUnits intergalacticUnits,
                         IntergalacticQuestions intergalacticQuestions) {
        this.intergalacticNumbers = intergalacticNumbers;
        this.intergalacticUnits = intergalacticUnits;
        this.intergalacticQuestions = intergalacticQuestions;
    }
}
