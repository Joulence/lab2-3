package Java.lab2.textProcessor.SerializationFucntions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
    public void deserialization() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person person = (Person) objectInputStream.readObject();
            System.out.println(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
