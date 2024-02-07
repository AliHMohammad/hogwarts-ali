package edu.hogwarts.application;



import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.Filterable;

import java.util.*;

public class StudentController implements Filterable<HogwartsStudent> {


    private Map<Integer, HogwartsStudent> students;
    private int idCounter;


    public StudentController() {
        students = new HashMap<>();
        idCounter = 1;
    }

    public void createStudent(HogwartsStudent student) {
        students.put(idCounter++, student);
    }

    public HogwartsStudent getStudent(int id) {
        return students.get(id);
    }

    public List<HogwartsStudent> getAllStudents() {
        return students.values().stream().toList();
    }

    public void updateStudent(int id, HogwartsStudent student) {
        students.put(id, student);
    }

    public void deleteStudent(int id) {
        students.remove(id);
    }

    @Override
    public List<HogwartsStudent> filter(String filterBy) {
        if (filterBy.equals("teacher")) {
            return new ArrayList<>();
        }

        if (filterBy.equals("student")) {
            return getAllStudents();
        }


        return students.values().stream()
                .filter(student -> student.getHouse().toString().toLowerCase().equals(filterBy))
                .toList();
    }

}
