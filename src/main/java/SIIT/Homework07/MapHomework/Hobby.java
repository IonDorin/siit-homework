package SIIT.Homework07.MapHomework;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private ArrayList <Address> addresses;

    public Hobby(String name, int frequency, ArrayList <Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;

    }

    @Override
    public String toString() {
        return name+" , " +frequency+" , "+addresses;
    }
}
