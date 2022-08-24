import SIIT.Homework08_Exceptions.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

public class TestForStudentRepository {

    /**
     * Test if the first name is null.
     */
    @Test
    public void testForFirstName(){
        LocalDate birthdate = LocalDate.of(1999,9,23);
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Student(null,"Doe","m","1234",birthdate));
    }

    /**
     * Test if the last name is null.
     */
    @Test
    public void testForLastName(){
        LocalDate birthdate = LocalDate.of(1999,9,23);
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Student("John",null,"m","1234",birthdate));
    }

    /**
     * Test if the birth year is smaller than 1900.
     */
    @Test
    public void testForBirthYear(){
        LocalDate birthdate = LocalDate.of(1899,9,23);
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Student("John","Doe","m","1234",birthdate));

    }

    /**
     * Test if age is smaller than 18.
     */
    @Test
    public void testForAge(){
        LocalDate birthdate = LocalDate.of(2020,9,23);
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Student("John","Doe","m","1234",birthdate));

    }

    /**
     * Test if other gender then accepted is given.
     */
    @Test
    public void testForOtherGender(){
        LocalDate birthdate = LocalDate.of(1899,9,23);
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Student("John","Doe","c","1234",birthdate));

        }
    }

