package SIIT.Homework05;

public class SamsungGalaxyS10 extends Samsung{
    double battery;

    public SamsungGalaxyS10(String color, String material, String imei) {
        super(color, material, imei);
        this.battery = 9;
    }
}
