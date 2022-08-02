package SIIT.Homework07.SetHomework;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    /** Created a comparator which compares two object by name
     * @param p1 the first object to be compared.
     * @param p2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
