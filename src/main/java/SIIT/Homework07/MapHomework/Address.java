package SIIT.Homework07.MapHomework;

public class Address {
    private final String country;
    private final String city;
    private final String details;

    public Address(String country,String city,String details) {
        this.country = country;
        this.city = city;
        this.details = details;
    }

    @Override
    public String toString() {
        return country+" , "+city+" , "+details;
    }
}
