package homework_11;

import homework_11.data.Planets;

/**
 * For tasting.
 * @author Ruben
 */
public class Main {
    /**
     * Working method for test.
     * @param args .
     */
    public static void main(String[] args) {
        // Printing the name and yearLength of each planet
        for (Planets planet : Planets.values()) {
            System.out.println("Planet: " + planet.getName() + ", Year Length: " + planet.getYearLength() + " Earth days.");
        }
        // Printing the non-capitalized name of each planet
        for (Planets planet : Planets.values()) {
            System.out.println("Planet: " + planet.nameLowerCase());
        }

        //Printing the number of day in week.
        DaysOfWeek day = DaysOfWeek.MONDAY;
        System.out.println(day.getDayNumber());

        //Printing the area of square.
        Shape square = Shape.SQUARE;
        square.setSide(4.0);
        System.out.println("Area of square: " + square.area());

        //Printing distance from sun for this planet.
        Planet earth = Planet.EARTH;
        System.out.println("Distance from sun of Earth: " + earth.getDistanceFromSun() + " million km");

    }
}
