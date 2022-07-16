package SIIT.Homework05;

import SIIT.Homework05.Actions.Call;
import SIIT.Homework05.Actions.Contact;
import SIIT.Homework05.Actions.Message;

import java.awt.*;
import java.util.ArrayList;

public class Phone implements PhoneMethods{
 String color;
 String material;
 String imei;
  float battery;



    private  ArrayList<Contact> contacts;
 private ArrayList<Message> messages;
 private ArrayList<Call> callLog;

 public Phone(String color,String material, String imei){
     this.color = color;
     this.material = material;
     this.imei = imei;
     this.contacts = new ArrayList<>();
     this.messages = new ArrayList<>();
     this.callLog = new ArrayList<>();
 }



    @Override
    public  void addContact(int id, String name, String lastName, String phoneNumber) {
        Contact contact = new Contact(id,name,lastName,phoneNumber);
        contacts.add(contact);

    }

    @Override
    public void listContacts() {
        for (int i = 0; i <contacts.size() ; i++) {

        }
        System.out.println("This is your contact list "+contacts);
        }



    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
     if (battery < 1){
         throw new RuntimeException("battery too low, please recharge");
     }
     if(messageContent.length() > 500){
        messageContent.substring(0,500);
        battery = battery-2;

     }
     Message message = new Message(phoneNumber, messageContent);


            messages.add(message);

        System.out.println("Sent message: "+messageContent);
        battery = battery-1;
        System.out.println("Remaining battery: "+battery);
    }

    @Override
    public void listMessages() {

    }

    @Override
    public void call(String phoneNumber) {

    }

    @Override
    public void callHistory() {

    }
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    }

