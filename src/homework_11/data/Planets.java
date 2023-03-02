package homework_11.data;

/**
 * Homework 11.
 * @author Ruben
 */
public enum Planets {
    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);


    private final String name;
    private final int yearLength;

    /**
     * Constructor for fields.
     * @param name .
     * @param yearLength .
     */
    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for yearLength.
     * @return yearLength
     */
    public int getYearLength() {
        return yearLength;
    }

    /**
     * Name transform to lowercase.
     * @return name lowercase
     */
    public String nameLowerCase() {
        return name.toLowerCase();
    }

}

