package SIIT.homework_OOP_2;

public class Main {
    public static void main(String[] args) {

        Car Logan = new Logan(39,15,"wb213");
        Car Sandero = new Sandero(45,14,"wab334");
        Car Focus = new Focus(34,17,"wab543");
        Car Fiesta = new Fiesta(24,14,"wab544");


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
        System.out.println("After our trip the available fuel is " +Logan.getAvailableFuel() );

        System.out.println();

        System.out.println("It's time to take Focus for a spin, available fuel is "+Focus.getAvailableFuel());
        Focus.start();
        Focus.shiftGears(1);
        Focus.drive(0.1);
        Focus.shiftGears(2);
        Focus.drive(1);
        Focus.shiftGears(3);
        Focus.drive(3);
        Focus.shiftGears(4);
        Focus.drive(13);
        Focus.shiftGears(5);
        Focus.drive(32);
        Focus.shiftGears(6);
        Focus.drive(112);
        Focus.shiftGears(5);
        Focus.drive(2);
        Focus.shiftGears(4);
        Focus.drive(1);
        Focus.shiftGears(3);
        Focus.drive(0.6);
        Focus.shiftGears(2);
        Focus.drive(0.5);
        Focus.shiftGears(1);
        Focus.stop();
        System.out.println("Total distance traveled with Focus was "+ Focus.getTrip());
        System.out.println("Available fuel is "+Focus.getAvailableFuel());
    }


}