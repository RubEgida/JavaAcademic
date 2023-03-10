package homework_12.pizza;

public enum PizzaTopping {
    PEPPERONI(2.0),
    MUSHROOMS(1.2),
    ONIONS(1.4),
    SAUSAGE(0.8);

    private final double price;

    PizzaTopping(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
