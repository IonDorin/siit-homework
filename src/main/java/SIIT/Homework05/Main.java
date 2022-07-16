package SIIT.Homework05;

import SIIT.Homework05.Actions.Contact;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new SamsungGalaxyS20("black","glass","3223");
        Phone phone2 = new G30("grey","plastic","3423");


        phone1.addContact(1,"John","Doe","+31489070");
        phone1.addContact(2,"Jane","Doe","+31485400");
        phone1.addContact(3,"John","Cena","+31489543");

        System.out.println("---------------------");

        phone1.listContacts();

        System.out.println("---------------------");

        phone1.sendMessage("+3148907","hello");
    }
}
