package homework_10.inheritance;

public class Human {
    private String name;
    private Heart heart;

    public Human(String name, Heart heart) {
        this.name = name;
        this.heart = heart;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Heart heartObj = new Heart();
        Human humanObj = new Human("John Doe", heartObj);
        System.out.println(humanObj.getName() + "'s heart is beating.");
    }
}
