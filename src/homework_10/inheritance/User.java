package homework_10.inheritance;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Address> addresses;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public void removeAddress(Address address) {
        this.addresses.remove(address);
    }

    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "AnyTown", "CA", "12345");
        Address address2 = new Address("456 Oak Ave", "SomeTown", "CA", "67890");
        User user = new User("John Doe", "johndoe@example.com");
        user.addAddress(address1);
        user.addAddress(address2);
        List<Address> addresses = user.getAddresses();
        for (Address address : addresses) {
            System.out.println(user.getName() + " lives at " + address.getStreet() + ", " + address.getCity() + ", " + address.getState() + " " + address.getZipCode());
        }
    }
}
