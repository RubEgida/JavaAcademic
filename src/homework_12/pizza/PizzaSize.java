package homework_12.pizza;

public enum PizzaSize {
    SMALL(5.5),
    MEDIUM(8.5),
    LARGE(10.5);

    private final double price;

    PizzaSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
