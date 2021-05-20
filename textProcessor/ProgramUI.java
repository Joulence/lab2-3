package Java.lab2.textProcessor;

import Java.lab2.textProcessor.SerializationFucntions.SerializationOptions;
import Java.lab2.textProcessor.TextProcessorFunctions.TextProcessor;

import java.util.Scanner;

public class ProgramUI {
    TextProcessor textProcessor = new TextProcessor();
    SerializationOptions serializationOptions = new SerializationOptions();
    Scanner scanner = new Scanner(System.in);

    public void chooseProgram() {
        System.out.println("Choose program:\n1 - Text Processor\n2 - Serialization" +
                "\nType and press anything to shut down the program");
        System.out.print("> ");
        String chooseNum = scanner.nextLine();
        switch (chooseNum) {
            case "1":
                textProcessor.textProcessor();
                chooseProgram();
            case "2":
                serializationOptions.chooseOption();
                chooseProgram();
            default:
                break;
        }
    }
}
