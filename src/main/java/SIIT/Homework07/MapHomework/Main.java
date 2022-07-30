package SIIT.Homework07.MapHomework;

import SIIT.Homework07.SetHomework.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Person John = new Person("John",20);
        Person Jane = new Person("Jane",32);
        Person Luke = new Person("Luke",31);

        ArrayList<Address> address1 = new ArrayList<>();
        ArrayList<Address> address2 = new ArrayList<>();
        ArrayList<Address> address3 = new ArrayList<>();

        address1.add(new Address("Romania", "Bucuresti", "At the Olimpic Swimming pool"));
        address2.add(new Address("Romania","Fagaras","Fagarasi mountains"));
         address3.add(new Address("Austria","Ischgl","At the KitSki resort"));

        ArrayList<Hobby> hobby1 = new ArrayList<>();
        Hobby h1 = new Hobby("Swimming", 4, address1);
        hobby1.add(h1);

        ArrayList<Hobby> hobby2 = new ArrayList<>();
        hobby2.add(new Hobby("Hiking",2,address2));

        ArrayList<Hobby> hobby3 = new ArrayList<>();
        hobby3.add(new Hobby("Skiing",3,address3));


        List<ArrayList<Hobby>> hobbyList = new ArrayList<>();
        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        hobbyList.add(hobby3);

        for (int i = 0; i <hobbyList.size() ; i++) {
            System.out.println(hobbyList.get(i));

        }

        Map<Person,List<Hobby>> personMap = new HashMap<>();
        personMap.put(John,hobby1);
        personMap.put(Jane,hobby2);
        personMap.put(Luke,hobby3);
        System.out.println("--------------------");
for (Map.Entry<Person,List<Hobby>> entry: personMap.entrySet()){
    System.out.println(entry.getKey()+"->"+entry.getValue());
}
        System.out.println("--------------------");

        for(Person person : personMap.keySet()){
            System.out.println(John + ">" + personMap.get(John));
            break;
        }
    }
}
