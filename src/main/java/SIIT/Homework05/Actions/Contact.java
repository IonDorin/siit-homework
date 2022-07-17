package SIIT.Homework05.Actions;

public class Contact {
   protected int id;
    protected String phoneNumber;
   protected String name;
   protected String lastName;

    public Contact(int id,String name, String lastName, String phoneNumber){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name: "+ name +" Last name: " +lastName+" Phone number: " + phoneNumber;
    }
}
