package SIIT.homework_OOP_2;

public class Focus extends Ford{

    public Focus(float availableFuel, int tireSize, String chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelTankSize = 70;
        this.fuelType = "Petrol";
        this.gears = 6;
        this.consumptionPer100Km = 6.2;
    }
}
