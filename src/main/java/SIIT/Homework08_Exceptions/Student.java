package SIIT.Homework08_Exceptions;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Student {
    protected String firstName;
    protected String lastName;
    String gender;
    protected String id;
    protected LocalDate birthDate;
    static LocalDate localDate = LocalDate.now();
    private static final Logger Log = Logger.getLogger(Student.class.getName());

    /**
     *  Created a student with following parameters.
     * @param firstName of the student.
     * @param lastName of the student.
     * @param gender of the student.
     * @param id of the student.
     * @param birthDate of the student.
     */

    public Student(String firstName, String lastName, String gender, String id, LocalDate birthDate) {
        /**
         * An exception is thrown if any of the first name or lastname is empty.
         */
        if ((firstName == null) || (lastName == null)) {
            throw new IllegalArgumentException("Field first name and last name should not be empty");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    /** An exception s thrown if gender is empty or different from accepted (m/M/f/F), upper and lower case accepted.
    *
    */
        if ((gender == null) || ((!gender.equalsIgnoreCase("M")) &&
                (!gender.equalsIgnoreCase("F")))) {
            throw new IllegalArgumentException("Accepted gender is f/F/m/M");


        }
        this.gender = gender;

        /** An exception s thrown if id field is empty.
         *
         */
        if (id == null){
            throw new IllegalArgumentException("Field id should not be empty");
        }

      this.id = id;
        this.birthDate = birthDate;

        /** An exception s thrown if birth year of the student is smaller than 1900 or age is smaller than 18.
         */

        if ((birthDate.getYear() < 1900) || (getAge()<18)){
            throw new IllegalArgumentException("Unsupported age for a student");
      }

  }

    /** This method calculates the age of the student by subtracting the birth year from current year.
     *
     * @return Age of the student.
     */
  public int getAge(){
        int age = localDate.getYear() - birthDate.getYear();
/**
 * An exception is thrown if age is a negative number.
 */
        if (age < 0) {
            throw new IllegalArgumentException("Age should be a positive number");
        }
      return age;

  }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return firstName +" "+ lastName+" Gender: "+gender+" Birthdate: "+birthDate;
    }
}
