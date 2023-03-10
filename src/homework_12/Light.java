package homework_12;

public enum Light {
    GREEN("green"),
    RED("red"),
    YELLOW("yellow");

    private final String light;

    Light(String light) {
        this.light = light;
    }

    public String getLight() {
        return light;
    }

    public static String getChange(int num) {
        return switch (num) {
            case 1 -> GREEN.getLight();
            case 2 -> RED.getLight();
            case 3 -> YELLOW.getLight();
            default -> null;
        };
    }
}
