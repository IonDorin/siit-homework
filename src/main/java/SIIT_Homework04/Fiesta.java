package SIIT_Homework04;

public class Fiesta extends Ford{

    public Fiesta(float availableFuel, int tireSize, String chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelTankSize = 50;
        this.fuelType = "Diesel";
        this.gears = 6;
        this.consumptionPer100Km = 4.5;
    }
}
