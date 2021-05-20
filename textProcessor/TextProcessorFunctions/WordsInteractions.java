package textProcessor.TextProcessorFunctions;

public class WordsInteractions {
    CountCharacters countCharacters = new CountCharacters();
    LettersScanner lettersScanner = new LettersScanner();
    WordsOperation wordsOperation = new WordsOperation();
    ConsoleIO consoleIO = new ConsoleIO();
    public String wordString;

    public void createString() {
        wordString = consoleIO.ConsoleString();
    }

    public void words() {
        countCharacters.countCharacters(wordString);
        lettersScanner.scan(wordString);
    }

    public void analyze() {
        createString();
        if (wordString.isEmpty()) {
            System.out.println("You typed nothing");
        } else {
            words();
        }
    }

    public void removeSpaces() {
        createString();
        wordsOperation.removeSpaces(wordString);
    }

    public void addSpaces() {
        createString();
        wordsOperation.addSpaces(wordString);
    }

    public void replaceText() {
        createString();
        wordsOperation.replaceString(wordString);
    }

    public void addText() {
        createString();
        wordsOperation.addString(wordString);
    }

    public void removeText() {
        createString();
        wordsOperation.removeString(wordString);
    }
}
