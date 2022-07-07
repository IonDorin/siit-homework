package SIIT_Homework04;

public abstract class Car implements Vehicle {

 int fuelTankSize;
 String fuelType;
 int gears;
 int currentGear;
double consumptionPer100Km;

 String chassisNumber;
 int tyreSize;
 float availableFuel;
 double trip;
 float tripConsumption;



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

    /** This method is implemented from Vehicle interface.
     * At every car start trip consumption and trip distance are reseted.
     */
    @Override
    public void start() {

    trip = 0;
    tripConsumption = 0;
        System.out.println("The car starts.");


    }

    /** In this method the car is being driven for a number of Km in different gears.
     * I have also calculated how much fuel the car needed to travel and how much fuel is still available in the tank.
     * @param km is the distance traveled in a gear.
     */
    @Override
    public  void drive(double km) {
    tripConsumption = (float) (km *(getConsumptionPer100Km()/100));
    availableFuel =  (availableFuel - tripConsumption);

    if (availableFuel < 0) {
        throw new IllegalArgumentException("The tank is empty. Please refuel");
        }
        trip = trip + km;



    }

    /** In this method we calculate average fuel consumption for a trip with a car.
     *
     * @return Average fuel consumption for a traveled distance(trip).
     */
    public double averageFuelConsumption(){
        return tripConsumption * 100 / trip;
    }

    /**This method lets the user shift through available gears of a car.
     * If the user inputs a gear that is not in the range ( number of gears of the car) an exceptions is thrown.
     * @param gear The gear in which car will drive.
     */
    public void shiftGears(int gear){
    if (gear > gears || gear < 1){
        throw new IllegalArgumentException("That gear doesn't exists,please check car manual. ");
    }
    currentGear = gear;
    }

    /**This method stops the car and the user gets a message with the amount of fuel needed between start and stop.
     *
     */
    @Override
    public void stop() {
        System.out.println("The car has stopped "+getTripConsumption()+" liters was the amount of fuel consumed" );


    }
}
