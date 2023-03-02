package homework_10.abstract_and_interface;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle is drawn");
    }

    @Override
    void erase() {
        System.out.println("Circle is erased");
    }
}
