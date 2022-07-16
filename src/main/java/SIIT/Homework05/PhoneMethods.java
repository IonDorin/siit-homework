package SIIT.Homework05;

import SIIT.Homework05.Actions.Contact;

public interface PhoneMethods {
    void addContact(int id,String name, String lastName, String phoneNumber);

    void listContacts();

    void sendMessage(String phoneNumber, String message);

    void listMessages();

    void call(String phoneNumber);

    void callHistory();
}
