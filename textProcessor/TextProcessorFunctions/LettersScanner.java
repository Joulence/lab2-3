package Java.lab2.textProcessor.TextProcessorFunctions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LettersScanner {

    public void scan(String string) {
        int uppers = 0, lowers = 0, other = 0;

        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c))
                ++uppers;
            else if (Character.isLowerCase(c))
                ++lowers;
            else
                ++other;
        }

        int count = 0;
        boolean isPreviousDigit = false;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                if (!isPreviousDigit) {
                    count++;
                    isPreviousDigit = true;
                }
            } else {
                isPreviousDigit = false;
            }
        }

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(string);
        int start = 0;

        System.out.print("Uppercase letters:\t" + uppers +
                "\nLowercase letters:\t" + lowers +
                "\nOther symbols:\t\t" + other +
                "\nNumber of numbers:\t" + count + "\nNumbers:\t\t\t");


        while (matcher.find(start)) {
            String value = string.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            System.out.print(result + " ");
            start = matcher.end();
        }
    }
}