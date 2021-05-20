package Java.lab2.textProcessor.SerializationFucntions;

import java.util.Scanner;

public class SerializationOptions {
    Serialize serialize = new Serialize();
    Deserialize deserialize = new Deserialize();

    public void chooseOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose:\n1 - Serialization\n2 - Deserialization\n" +
                "Type and press anything to get back");
        System.out.print("> ");
        String chooseOption = scanner.nextLine();
        if (chooseOption.equals("1")) {
            serialize.serialization();
        } else if (chooseOption.equals("2")) {
            deserialize.deserialization();
        }
    }
}
