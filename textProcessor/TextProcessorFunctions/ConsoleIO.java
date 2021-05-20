package Java.lab2.textProcessor.TextProcessorFunctions;

import java.util.Scanner;

public class ConsoleIO {
    public String ConsoleString() {
        System.out.println("Please write a string...");
        System.out.print("> ");
        Scanner inputConsoleString = new Scanner(System.in);
        return inputConsoleString.nextLine();
    }
}