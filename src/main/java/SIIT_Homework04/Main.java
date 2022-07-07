package SIIT_Homework04;

public class Main {
    public static void main(String[] args) {

        /**
         * Created two car models for each car brand.
         */

        Car Logan = new Logan(39,15,"wb213");
        Car Sandero = new Sandero(45,14,"wab334");
        Car Focus = new Focus(34,17,"wab543");
        Car Fiesta = new Fiesta(40,14,"wab544");


        System.out.println("Let's take Logan for a ride, available fuel is "+Logan.getAvailableFuel());
        Logan.start();
        Logan.shiftGears(1);
        Logan.drive(0.2);
        Logan.shiftGears(2);
        Logan.drive(0.4);
        Logan.shiftGears(3);
        Logan.drive(1);
        Logan.shiftGears(4);
        Logan.drive(2);
        Logan.shiftGears(5);
        Logan.drive(4);
        Logan.shiftGears(6);
        Logan.drive(50);
        Logan.stop();
        System.out.println("Total distance traveled was "+ Logan.getTrip());
        System.out.println("Average fuel consumption was "+Logan.averageFuelConsumption() + " l/100km");
        System.out.println("After our trip the available fuel is " +Logan.getAvailableFuel() );

        System.out.println();

        System.out.println("Let's take Logan for a ride again, available fuel is "+Logan.getAvailableFuel());
        Logan.start();
        Logan.shiftGears(1);
        Logan.drive(0.5);
        Logan.shiftGears(2);
        Logan.drive(0.5);
        Logan.shiftGears(3);
        Logan.drive(4);
        Logan.shiftGears(4);
        Logan.drive(5);
        Logan.shiftGears(5);
        Logan.drive(6);
        Logan.shiftGears(6);
        Logan.drive(120);
        Logan.stop();
        System.out.println("Total distance traveled was "+ Logan.getTrip());
        System.out.println("Average fuel consumption was "+Logan.averageFuelConsumption() + " l/100km");
        System.out.println("After our trip the available fuel is " +Logan.getAvailableFuel() );

        System.out.println();

        System.out.println("It's time to take Fiesta for a spin, available fuel is "+Fiesta.getAvailableFuel());
        Fiesta.start();
        Fiesta.shiftGears(1);
        Fiesta.drive(0.1);
        Fiesta.shiftGears(2);
        Fiesta.drive(1);
        Fiesta.shiftGears(3);
        Fiesta.drive(3);
        Fiesta.shiftGears(4);
        Fiesta.drive(13);
        Fiesta.shiftGears(5);
        Fiesta.drive(32);
        Fiesta.shiftGears(6);
        Fiesta.drive(112);
        Fiesta.stop();
        System.out.println("Total distance traveled with Fiesta was "+ Fiesta.getTrip());
        System.out.println("Average fuel consumption was "+Fiesta.averageFuelConsumption() + " l/100km");
        System.out.println("Available fuel is "+Fiesta.getAvailableFuel());
    }


}