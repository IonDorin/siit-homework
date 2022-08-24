package SIIT.Homework08_Exceptions;

import org.apache.logging.log4j.Level;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {


        try{
        LocalDate birthdate1 = LocalDate.of(1990, 8, 21);
        LocalDate birthdate2 = LocalDate.of(1989, 3, 30);
        LocalDate birthdate3 = LocalDate.of(2000, 4, 25);
        LocalDate birthdate4 = LocalDate.of(1989, 5, 4);

        Student John = new Student("John", "Doe", "m", "0123476", birthdate1);
        Student Marry = new Student("Marry", "jane", "F", "02314157", birthdate2);
        Student Angie = new Student("Angelica", "May", "F", "0287659", birthdate3);
        Student Leo = new Student("Leonard", "Doroftei", "M", "0149586", birthdate4);


            StudentRepository studentRepository = new StudentRepository();
            studentRepository.addStudent(John);
            studentRepository.addStudent(Marry);
            studentRepository.addStudent(Angie);
            studentRepository.addStudent(Leo);

            LOG.info("Listing the students in the repository "+studentRepository.listStudents() );

            LOG.info("Listing students with age 33 "+studentRepository.retrieveByAge(33));

            studentRepository.deleteById("0123476");

            LOG.info("Listing the students in the repository after student was deleted"+studentRepository.listStudents() );



        } catch (Exception e) {
           LOG.warning("Error occurred "+ e.getMessage());
        }

    }
}
