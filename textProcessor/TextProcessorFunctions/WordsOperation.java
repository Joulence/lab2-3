package Java.lab2.textProcessor.TextProcessorFunctions;

import java.util.Scanner;

public class WordsOperation {

    public void removeSpaces(String string) {
        System.out.println(string.replaceAll("\\s+",""));
    }

    public void addSpaces(String string) {
        System.out.println(string.replaceAll("\\s+","").replace("**", " "));
    }

    public void replaceString(String string) {
        System.out.println(string);
        Scanner replaceStr = new Scanner(System.in);
        System.out.println("Type word which have to be replaced...");
        System.out.print("> ");
        String toReplace = replaceStr.nextLine();
        System.out.println("Type new word");
        System.out.print("> ");
        String replaced = replaceStr.nextLine();
        System.out.println(string.replace(toReplace, replaced));
    }

    public void addString(String string) {
        System.out.println(string);
        Scanner addString = new Scanner(System.in);
        System.out.println("Type string to add...");
        System.out.print("> ");
        String toAdd = addString.nextLine();
        System.out.println(string + toAdd.replace("**", " "));
    }

    public void removeString(String string) {
        System.out.println(string);
        Scanner removeString = new Scanner(System.in);
        System.out.println("Choose string to delete from your string...");
        System.out.print("> ");
        String toRemove = removeString.nextLine();
        System.out.println(string.replace(toRemove, ""));
    }
}
