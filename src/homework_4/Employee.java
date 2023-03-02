package homework_4;

/**
 * Homework 4.
 * @author Ruben
 */
public class Employee {
    int id;
    String name;
    String department;
    int age;
    String gender;

    /**
     * Tack all fields values.
     * @param id
     * @param name
     * @param department
     * @param age
     * @param gender
     */
    public void printEmployee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Working method.
     * @param args
     */
    public static void main(String[] args) {
        Employee a = new Employee();
        a.printEmployee(133, "Ruben" , "Yerevan", 24, "men");

        Employee b = new Employee();
        b.printEmployee(143, "Gor" , "Vanadzor", 32, "men");

        Employee c = new Employee();
        c.printEmployee(122, "Varia", "Yerevan", 24, "woman");
    }
}
