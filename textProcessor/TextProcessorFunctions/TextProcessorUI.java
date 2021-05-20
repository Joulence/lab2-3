package Java.lab2.textProcessor.TextProcessorFunctions;

import java.util.Scanner;

public class TextProcessorUI {
    WordsInteractions wordsInteractions = new WordsInteractions();

    public void startTitle() {
        System.out.println("Text Processor");
        System.out.println("What do you want to do?");
    }


    public void textOperations() {
            System.out.println();
            System.out.println("1 - Analyze text\n2 - Remove spaces\n3 - Add spaces\n4 - Replace text" +
                    "\n5 - Add text\n6 - Remove text" +
                    "\nType anything else to get back");
            System.out.print("> ");
            Scanner scanner = new Scanner(System.in);
            String numberChoose = scanner.nextLine();

            switch (numberChoose) {
                case "1" -> {
                    wordsInteractions.analyze();
                    textOperations();
                }
                case "2" -> {
                    wordsInteractions.removeSpaces();
                    textOperations();
                }
                case "3" -> {
                    wordsInteractions.addSpaces();
                    textOperations();
                }
                case "4" -> {
                    wordsInteractions.replaceText();
                    textOperations();
                }
                case "5" -> {
                    wordsInteractions.addText();
                    textOperations();
                }
                case "6" -> {
                    wordsInteractions.removeText();
                    textOperations();
                }
            }
    }
}