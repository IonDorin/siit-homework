package SIIT.Homework07.MapHomework;

public class Address {
    private String country;
    private String city;
    private String details;

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
