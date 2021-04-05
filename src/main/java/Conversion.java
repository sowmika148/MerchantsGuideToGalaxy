import Inputs.IntergalacticQuestions;

class Conversion {

    String[] input;

    Conversion(String[] input) {
        this.input = input;
    }

    String[] convert(){
        InputProcessor inputProcessor = new InputProcessor(input);
        IntergalacticQuestions intergalacticQuestions = inputProcessor.processInput();
        String[] output = new String[100];
        return output;
    }
}
