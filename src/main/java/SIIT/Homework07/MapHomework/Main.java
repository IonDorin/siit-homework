package SIIT.Homework07.MapHomework;

import SIIT.Homework07.SetHomework.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /** In this program I created 3 Person objects, each person has a name and an age.
         * For each person I created an object Hobby with name (of the hobby), frequency, and an address parameters.
         * For each hobby I created an object Address with country, city and details parameters.
         */

        Person John = new Person("John",20);
        Person Jane = new Person("Jane",32);
        Person Luke = new Person("Luke",31);


        /** Here I created a list with address for each hobby.

         */
        ArrayList<Address> address1 = new ArrayList<>();
        ArrayList<Address> address2 = new ArrayList<>();
        ArrayList<Address> address3 = new ArrayList<>();

        address1.add(new Address("Romania", "Bucuresti", "At the Olimpic Swimming pool"));
        address2.add(new Address("Romania","Fagaras","Fagarasi mountains"));
        address3.add(new Address("Austria","Ischgl","At the KitSki resort"));


        /** Here I created a hobby and added an address for it and then saved it in a list .
         */
        ArrayList<Hobby> hobby1 = new ArrayList<>();
        Hobby h1 = new Hobby("Swimming", 4, address1);
        hobby1.add(h1);

        ArrayList<Hobby> hobby2 = new ArrayList<>();
        hobby2.add(new Hobby("Hiking",2,address2));

        ArrayList<Hobby> hobby3 = new ArrayList<>();
        hobby3.add(new Hobby("Skiing",3,address3));

        /** Here I created a list "hobbyList" where I saved all the hobbies.
         */
        List<ArrayList<Hobby>> hobbyList = new ArrayList<>();
        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        hobbyList.add(hobby3);

        for (ArrayList<Hobby> hobbies : hobbyList) {
            System.out.println(hobbies);

        }

        /** Here I created a mep where I added previously created persons as a key and each hobby as a value.
         *
         */

        Map<Person,List<Hobby>> personMap = new HashMap<>();
        personMap.put(John,hobby1);
        personMap.put(Jane,hobby2);
        personMap.put(Luke,hobby3);
        System.out.println("--------------------");


        /** I have iterated through the map after entry and printed out for each entry the key and its value.
         */

    for (Map.Entry<Person,List<Hobby>> entry: personMap.entrySet()){
    System.out.println(entry.getKey()+"->"+entry.getValue());
}
        System.out.println("--------------------");

        /** Here I iterated through the map after a specific key (person John in this case) and printed out the value.
         */

        for(Person person : personMap.keySet()){
            System.out.println(John + "->" + personMap.get(John));
            break;
        }
    }
}
