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
        phone1.addContact(3,"Chris","Cena","+31489543");

        System.out.println("---------------------");

        phone1.listContacts();

        System.out.println("---------------------");

        phone1.sendMessage("+31489070","hello");
        phone1.sendMessage("053346733","wyd");
        phone1.sendMessage(phone1.getContacts().get(0),"Hello John");
        System.out.println("---------------------");

        phone1.listMessages();
        System.out.println("---------------------");

        phone1.listMessages(phone1.getContacts().get(0));
        System.out.println("---------------------");

        phone1.call("0123456789");
        phone1.call(phone1.getContacts().get(1));
        phone1.call(phone1.getContacts().get(2));
        System.out.println("---------------------");

        phone1.callHistory();

    }

}
