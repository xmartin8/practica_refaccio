package person;

import address.Address;

public class Customer extends Person { // REFACT: Extracció de classe i Inline Code
    public Customer(String name, String age, Address address) {
        super(name, age, address);
    }

    public String getFullName() {
        return name + " " + age;
    }
}

// Anterior codi
    // public class person.Customer {
    //     private String firstName;
    //     private String lastName;
    //
    //     public person.Customer(String firstName, String lastName) {
    //         this.firstName = firstName;
    //         this.lastName = lastName;
    //     }
    //
    //     public String getFullName() {
    //         return firstName + " " + lastName;
    //     }
    // }

