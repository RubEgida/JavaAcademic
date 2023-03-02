package homework_10.abstract_and_interface;

public class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle is drawn");
    }

    @Override
    void erase() {
        System.out.println("Triangle is erased");
    }
}
