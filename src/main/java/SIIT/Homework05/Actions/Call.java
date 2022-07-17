package SIIT.Homework05.Actions;

public class Call {
    String phoneNumber;

    public Call(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}
