package homework_10.inheritance;

import homework_10.inheritance.Car;

public class Truck extends Car {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Truck() {
        super();
    }
}
