package Model;

public class Human { // REFACT: 14 extrac classe
    private String name;
    private String age;
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;
    public String obtenirAdrecaCompleta() {
        StringBuilder result = new StringBuilder();
        return result
                .append(country)
                .append(", ")
                .append(city)
                .append(", ")
                .append(street)
                .append(", ")
                .append(house)
                .append(" ")
                .append(quarter).toString();
    }
}
