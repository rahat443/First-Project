package aggreation;

public class Address {
    String city, Country,Division;

    public Address(String city, String country, String division) {
        this.city = city;
        Country = country;
        Division = division;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }
}
