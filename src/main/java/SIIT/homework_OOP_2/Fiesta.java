package SIIT.homework_OOP_2;

public class Fiesta extends Ford{

    public Fiesta(float availableFuel, int tireSize, String chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelTankSize = 50;
        this.fuelType = "Diesel";
        this.gears = 5;
        this.consumptionPer100Km = 4.5;
    }
}
