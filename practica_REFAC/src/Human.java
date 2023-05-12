public class Human {
    public static class Huma {
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
                    //Refact 11 tipo inline code, ja que estic simplificant el codi i no fa falta fer tans append
                    .append(country + ", " + city + ", " + street + ", " + house + " " + quarter).toString();
                  /*
                  .append(country)
                  .append(", ")
                    .append(city)
                    .append(", ")
                    .append(street)
                    .append(", ")
                    .append(house)
                    .append(" ")
                    .append(quarter).toString();
                    */
        }
    }
}
