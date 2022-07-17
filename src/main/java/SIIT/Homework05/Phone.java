package SIIT.Homework05;

import SIIT.Homework05.Actions.Call;
import SIIT.Homework05.Actions.Contact;
import SIIT.Homework05.Actions.Message;

import java.awt.*;
import java.util.ArrayList;

public class Phone implements PhoneMethods {
    String color;
    String material;
    String imei;
    float battery;


    private ArrayList<Contact> contacts;
    private ArrayList<Message> messages;
    private ArrayList<Call> callLog;

    public Phone(String color, String material, String imei) {
        this.color = color;
        this.material = material;
        this.imei = imei;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.callLog = new ArrayList<>();
    }

    /**
     * This methods creates a contact and ads it to the contact list.
     * @param id The index of the contact(1st,2nd etc)
     * @param name Name of the contact.
     * @param lastName Last name of the contact.
     * @param phoneNumber Phone number of our contact.
     */
    @Override
    public void addContact(int id, String name, String lastName, String phoneNumber) {
        Contact contact = new Contact(id, name, lastName, phoneNumber);
        contacts.add(contact);

    }

    /** This method lists added contacts in the phone.
     */
    @Override
    public void listContacts() {
        for (int i = 0; i < contacts.size(); i++) {

        }
        System.out.println("This is your contact list " + contacts);
    }

    /**
     * Sends a message to a phone number.
     * With every message sent 1 hour is drained from the battery.
     * If the message content is longer then 500 characters then the message will be divided in two messages and 2 hours will be drained from the battery.
     * Throw an exception if battery is lower than 1.
     * @param phoneNumber the phone number to send the message.
     * @param messageContent the text we want to send.
     */
    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        if (battery < 1) {
            throw new RuntimeException("battery too low, please recharge");
        }
        if (messageContent.length() > 500) {
            messageContent.substring(0, 500);
            battery = battery - 2;

        }
        Message message = new Message(phoneNumber, messageContent);


        messages.add(message);

        System.out.println("Sent message: " + messageContent);
        battery = battery - 1;
        System.out.println("Remaining battery: " + battery);
    }

    /**
     * This method sends a message to a contact in our contact list.
     * @param contact the contact we want to text.
     * @param messageContent the text we want to send.
     */
    public void sendMessage(Contact contact, String messageContent) {
        if (battery < 1) {
            throw new RuntimeException("battery too low, please recharge");
        }
        if (messageContent.length() > 500) {
            messageContent.substring(0, 500);
            battery = battery - 2;

        }
        Message message = new Message(contact.getPhoneNumber(), messageContent);


        messages.add(message);

        System.out.println("Sent message: " + messageContent);
        battery = battery - 1;
        System.out.println("Remaining battery: " + battery);
    }

    /**
     * This method list all sent messages from the phone.
     */
    @Override
    public void listMessages() {
        for (int i = 0; i < messages.size(); i++) {
            System.out.println("Sent messages: " + messages.get(i));

        }

    }

    /**
     * This method list sent messages to a specific contact
     * @param contact the contact we messaged.
     */
    public void listMessages(Contact contact) {
        System.out.println("This are your sent messages to "+contact.getName()+" "+contact.getLastName());

        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i).getPhoneNumber().equals( contact.getPhoneNumber() )) {
                System.out.println("Sent messages: " + messages.get(i));
            }
        }
    }

    /**
     * In this method a call is made to a phone number.
     * If no number is entered or if the number is lower than 9 characters an exception is thrown.
     * Every time a call is made 2 hours will be drained from the battery.
     * @param phoneNumber the phone number we wish to call.
     */
        @Override
        public void call (String phoneNumber) {

        if (phoneNumber == null || phoneNumber.length() < 9) {
            throw new RuntimeException("The number you are trying to call is incorrect  ");
        }
            Call call = new Call(phoneNumber);
            callLog.add(call);

            battery = battery-2;
            System.out.println("You have called "+phoneNumber+ " remaining battery is "+battery);
        }

    /**
     * In this method we are calling someone in our contact list, also with every call 2 hours are drained from the battery.
     * @param contact The contact we wish to call.
     */
    public void call (Contact contact) {

        Call call = new Call(contact.getPhoneNumber());
        callLog.add(call);

        battery = battery-2;
        System.out.println("You have called "+contact.getName()+" "+contact.getLastName()+ " remaining battery is "+battery);
    }


    /**
     * This method list all calls made.
     */

        @Override
        public void callHistory () {
            System.out.println("Call history:");
            for (int i = 0; i < callLog.size(); i++) {
                System.out.println("This are your calls "+callLog.get(i));

            }

            }


        public ArrayList<Contact> getContacts () {
            return contacts;
        }


}


