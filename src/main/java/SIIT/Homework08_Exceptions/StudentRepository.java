package SIIT.Homework08_Exceptions;

import java.util.ArrayList;
import java.util.List;


public class StudentRepository {
    private final List<Student> studentRepo = new ArrayList<>();

    /** This method lists all the students in the repository.
     *
     * @return Student list.
     */
    public List<Student> listStudents() {
        return studentRepo;
    }

    /** This method adds a student to the repository.
     *
     */
    public void addStudent(Student student) {
        studentRepo.add(student);
    }

    /**This method deletes a student using id parameter.
     *
     * @param idToDelete ID of the student to be deleted.
     * If no student found in the repository with the inputted  ID an exception is thrown.
     */
    public void deleteById(String idToDelete) {
        Student studentToDelete = null;
        for (Student student : studentRepo) {
            if (student.getId().equals(idToDelete)) {
                studentToDelete = student;
                break;
            }

        }
        if (studentToDelete != null) {
            studentRepo.remove(studentToDelete);
        } else {
            throw new IllegalArgumentException("Student with ID " + idToDelete + " does not exist");
        }
    }

    /** This method lists all the students with a certain age.
     * If given age is smaller than 0 an exception is thrown.
     * @param age of the students.
     * @return a new list with students found.
     */
    public List<Student> retrieveByAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a number greater than 0");
        }
        List<Student> studentsByAge = new ArrayList<>();
        for (Student student : studentRepo) {
            if (student.getAge() == age) {
                studentsByAge.add(student);
            }

        }
        return studentsByAge;

    }
}



