package planets;

import java.util.Scanner;

public class PlanetsWeight {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Care este greutatea ta?");
        double weight = reader.nextDouble();

        double mass = weight / Planet.EARTH.surfaceGravity();
        for(Planet planet : Planet.values()) {
            System.out.print(planet.name());
            System.out.println(": ");
            System.out.println(planet.surfaceWeight(mass));
        }
    }
}
