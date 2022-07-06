package SIIT.homework_OOP_2;

public abstract class Car implements Vehicle {

 int fuelTankSize;
 String fuelType;
 int gears;
 int currentGear;
double consumptionPer100Km;

 String chassisNumber;
 int tyreSize;
 double availableFuel;
 double trip;
 double tripConsumption;



public Car(float availableFuel, int tireSize, String chassisNumber){
    this.availableFuel = availableFuel;
    this.tyreSize = tireSize;
    this.chassisNumber = chassisNumber;
    this.trip = 0;
    this.tripConsumption = 0;
    this.currentGear = 1;

}




    public double getAvailableFuel() {
        return availableFuel;
    }

    public double getTrip() {
        return trip;
    }

    public double getTripConsumption() {
        return tripConsumption;
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }


    @Override
    public void start() {

    trip = 0;
    tripConsumption = 0;
        System.out.println("The car starts.");


    }

    @Override
    public  void drive(double km) {
    tripConsumption = (float) (km *(getConsumptionPer100Km()/100));
    availableFuel =  (availableFuel - tripConsumption);

    if (availableFuel < 0) {
        throw new IllegalArgumentException("The tank is empty. Please refuel");
        }
        trip = trip + km;



    }

    public void shiftGears(int gear){
    if (gear > gears || gear < 1){
        throw new IllegalArgumentException("That gear doesn't exists,please check car manual ");
    }
    currentGear = gear;
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped "+getTripConsumption()+" liters was the amount of fuel consumed" );


    }
}
