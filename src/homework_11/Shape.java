package homework_11;

/**
 * Homework creating.
 * @author Ruben
 */
public enum Shape {
    CIRCLE(1.0) {
        @Override
        public double area() {
            return Math.PI * Math.pow(radius, 2);
        }
    },
    SQUARE(2.0) {
        @Override
        public double area() {
            return Math.pow(side, 2);
        }
    },
    RECTANGLE(3.0) {
        @Override
        public double area() {
            return length * width;
        }
    };

    private final double shapeType;
    protected double radius;
    protected double side;
    protected double length;
    protected double width;

    /**
     * Constructor.
     * @param shapeType .
     */
    Shape(double shapeType) {
        this.shapeType = shapeType;
    }


    /**
     * Shape-specific method.
     * @return .
     */
    public abstract double area();

    /**
     * Setter for radius.
     * @param radius .
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Setter for side.
     * @param side .
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Setter for length.
     * @param length .
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Setter for width.
     * @param width .
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Getter for shapeType.
     * @return shapeType
     */
    public double getShapeType() {
        return shapeType;
    }
}

