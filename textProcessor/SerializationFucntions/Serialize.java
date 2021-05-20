package Java.lab2.textProcessor.SerializationFucntions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//Serialization class

class Person implements Serializable {
    private final String name;
    private final int age;
    private final String car;
    private final String job;

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Car: " + car + "\n" +
                "Job: " + job + "\n";
    }

    public Person(String name, int age, String car, String job) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.job = job;
    }

}

public class Serialize {
    public void serialization() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type your name:");
            System.out.print("> ");
            String scannerName = scanner.nextLine();

            System.out.println("Type your age:");
            System.out.print("> ");
            int scannerAge = scanner.nextInt();
            System.out.print("");

            String scannerBug = scanner.nextLine();

            System.out.println("Type your car:");
            System.out.print("> ");
            String scannerCar = scanner.nextLine();

            System.out.println("Type your job:");
            System.out.print("> ");
            String scannerJob = scanner.nextLine();
            System.out.println();

            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
                Person person0 = new Person(scannerName, scannerAge, scannerCar, scannerJob);
                objectOutputStream.writeObject(person0);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("You typed something wrong");
            serialization();
        }

    }
}
