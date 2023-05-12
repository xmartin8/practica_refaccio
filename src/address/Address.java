package address;

public class Address { // REFACT: Extracció de classe
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public Address(String country, String city, String street, String house, String quarter) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.quarter = quarter;
    }
//REFACT:Extracció de variable
    public String getFullAddress() {
        String result = country +
                ", " +
                city +
                ", " +
                street +
                ", " +
                house +
                " " +
                quarter;
        return result;
    }
}
