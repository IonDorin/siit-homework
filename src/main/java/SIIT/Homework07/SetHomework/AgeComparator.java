package SIIT.Homework07.SetHomework;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    /** Created a comparator which compares two objects by age.
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
