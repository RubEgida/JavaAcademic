package homework_4;

/**
 * Homework 4.
 * @author Ruben
 */
public class Car {
    String model;
    String color;
    int currentSpeed;
    boolean isEngineStar;

    /**
     * Engin stop.
     * @return not work
     */
    public boolean stopEngine() {
        return this.isEngineStar = false;
    }

    /**
     * Engin start.
     * @return work
     */
    public boolean startEngine() {
        return this.isEngineStar = true;
    }

    /**
     * Working method.
     * @param args
     */
    public static void main(String[] args) {
        Car a = new Car();
        a.model = "C203";
        a.color = "black";

        Car b = new Car();
        b.model = "S505";
        b.color = "White";
    }
}
