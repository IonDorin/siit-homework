package SIIT_Homework04;

public class Sandero extends Dacia{

    public Sandero(float availableFuel, int tireSize, String chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelTankSize = 50;
        this.fuelType = "Petrol";
        this.gears = 5;
        this.consumptionPer100Km = 5.5;
    }
}
