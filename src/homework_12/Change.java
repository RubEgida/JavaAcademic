package homework_12;

public class Change extends State{
    private int light;

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    @Override
    public Light changeState(int light) {
        if (light < 1 || light > 3) {
            return null;
        } else {
            Light.getChange(light);
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
