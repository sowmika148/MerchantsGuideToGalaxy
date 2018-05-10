public class Conversion {

    String[] input;

    public Conversion(String[] input) {
        this.input = input;
    }

    public String[] convert(){
        InputProcessor inputProcessor = new InputProcessor(input);
        inputProcessor.processInput();
        String[] output = new String[100];
        return output;
    }
}
