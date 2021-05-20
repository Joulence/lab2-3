package Java.lab2.textProcessor.TextProcessorFunctions;

public class CountCharacters {
    public void countCharacters(String string) {
        System.out.println("With spaces: " + string.length() + " characters");
        System.out.println("Without spaces: " + string.replaceAll("\\s+","").length() + " characters");
    }
}
