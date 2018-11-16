package oop;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);   // ca sa scriem de la tastatura folosim Scanner

        Dog someDog = new Dog();
        System.out.println("Greutatea:");
        someDog.size = reader.nextInt();
        System.out.println("Cat:");
        someDog.bark(reader.nextInt());
    }
}
