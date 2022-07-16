package SIIT.Homework05;

public abstract class Motorola extends Phone {
    String color;
    String material;
    String imei;
    double battery;

    public Motorola(String color, String material, String imei) {
        super(color, material, imei);
    }
}
