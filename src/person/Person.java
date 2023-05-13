package person;

import address.Address;

public class Person { // REFACT: Extracció de classe,canvi de private a protected per afavorir principis d'encapsulació
    protected String name;
    protected String age;
    protected Address address; // REFACT: Extracció de classe

    public Person(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

// Anterior codi
    // private String country;
    // private String city;
    // private String street;
    // private String house;
    // private String quarter;

