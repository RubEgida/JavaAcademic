package homework_10.inheritance;

public class Employee {
    private String name;
    private Bank bank;

    public Employee(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public static void main(String[] args) {
        Bank bankObj = new Bank("ABC Bank");
        Employee empObj = new Employee("John Doe", bankObj);
        System.out.println(empObj.getName() + " works for " + empObj.getBank().getName());
    }
}
