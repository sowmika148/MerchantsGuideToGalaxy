import java.io.IOException;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String[] input  = scan.nextLine().split("\\s");
        Conversion conversion = new Conversion(input);
    }
}

