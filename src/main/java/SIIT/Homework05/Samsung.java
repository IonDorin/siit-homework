package SIIT.Homework05;

public abstract class  Samsung extends Phone {
    String color;
    String material;
    String imei;
    double battery;
    public Samsung(String color, String material, String imei) {
        super(color, material, imei);
    }
}
