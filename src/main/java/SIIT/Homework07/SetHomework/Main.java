package SIIT.Homework07.SetHomework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Gigi",31);
        Person p2 = new Person("Dutu",36);
        Person p3 = new Person("Lara",21);
        Person p4 = new Person("Ana",25);

        Set <Person> byName = new TreeSet<>(new NameComparator());
        byName.add(p1);
        byName.add(p2);
        byName.add(p3);
        byName.add(p4);

        System.out.println("Sorted by name");

        for (Person person:byName
             ) {
            System.out.println(person);
        }

        System.out.println("Sorted by age");

    Set<Person> byAge = new TreeSet<>(new AgeComparator());
        byAge.addAll(byName);
        Iterator<Person> myIterator = byAge.iterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }





        }
    }

