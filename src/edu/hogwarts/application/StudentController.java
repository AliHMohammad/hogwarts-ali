package edu.hogwarts.application;



import edu.hogwarts.data.HogwartsStudent;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentController {


    private Map<Integer, HogwartsStudent> students;


    public StudentController() {
        students = new HashMap<>();
    }

    public void createStudent(HogwartsStudent student) {

    }

    public HogwartsStudent getStudent(int id) {
        return null;
    }

    public Collection<HogwartsStudent> getAllStudents() {
        return students.values();
    }

    public void updateStudent(int id, HogwartsStudent student) {

    }

    public void deleteStudent(int id) {

    }
}
