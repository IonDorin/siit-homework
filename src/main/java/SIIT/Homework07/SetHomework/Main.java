package SIIT.Homework07.SetHomework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        /** Created 4 persons each with name and age.
         */

        Person p1 = new Person("Gigi",31);
        Person p2 = new Person("Dutu",36);
        Person p3 = new Person("Lara",21);
        Person p4 = new Person("Ana",25);

        /** Created a new set and added persons to it, and we used aur created NameComparator to sort the set.
         */
        Set <Person> byName = new TreeSet<>(new NameComparator());
        byName.add(p1);
        byName.add(p2);
        byName.add(p3);
        byName.add(p4);

        System.out.println("Sorted by name");

        /** Iterated through the set using a for loop.
         */
        for (Person person:byName
             ) {
            System.out.println(person);
        }

        System.out.println("Sorted by age");

        /** Here I created a new set "byAge" and I used AgeComparator to sort the set by age.
         */

        Set<Person> byAge = new TreeSet<>(new AgeComparator());
        byAge.addAll(byName);

        /** Iterated through the set using an iterator.
         */
        Iterator<Person> myIterator = byAge.iterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }





        }
    }

