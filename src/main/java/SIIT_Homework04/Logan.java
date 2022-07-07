package SIIT_Homework04;

public class Logan extends Dacia{

    public Logan(float availableFuel, int tireSize, String chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelTankSize = 60;
        this.fuelType = "Diesel";
        this.gears = 6;
        this.consumptionPer100Km = 4.9;
    }
}
