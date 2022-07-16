package SIIT.Homework05;

public class SamsungGalaxyS20 extends Samsung{
    String color;
    String material;
    String imei;
    double battery;
    public SamsungGalaxyS20(String color, String material, String imei) {
        super(color, material, imei);
        this.battery = 10;
    }
}
