package SIIT.Homework05.Actions;

import SIIT.Homework05.Samsung;

public class Message {
  protected   String phoneNumber;
    protected String message;

    public Message(String phoneNumber, String message){
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }
}
