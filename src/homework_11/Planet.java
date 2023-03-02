package homework_11;

/**
 * Homework creating.
 * @author Ruben
 */
public enum Planet {
    MERCURY(57.91),
    VENUS(108.2),
    EARTH(149.6),
    MARS(227.9),
    JUPITER(778.3),
    SATURN(1427.0),
    URANUS(2871.0),
    NEPTUNE(4497.1);

    private final double distanceFromSun;

    /**
     * Constructor.
     * @param distanceFromSun .
     */
    Planet(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    /**
     * Getter for distance from sun.
     * @return distanceFromSun
     */
    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}

