package edu.hogwarts.application;


import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.Filterable;

import java.util.*;

public class TeacherController implements Filterable<HogwartsTeacher> {

    private Map<Integer, HogwartsTeacher> teachers;
    private int idCounter;


    public TeacherController() {
        teachers = new HashMap<>();
        idCounter = 1;
    }

    public void createTeacher(HogwartsTeacher teacher) {
        teachers.put(idCounter++, teacher);
    }

    public HogwartsTeacher getTeacher(int id) {
        return teachers.get(id);
    }

    public List<HogwartsTeacher> getAllTeachers() {
        return teachers.values().stream().toList();
    }

    public void updateTeacher(int id, HogwartsTeacher teacher) {
        teachers.put(id, teacher);
    }

    public void deleteStudent(int id) {
        teachers.remove(id);
    }

    @Override
    public List<HogwartsTeacher> filter(String filterBy) {
        if (filterBy.equals("student")) {
            return new ArrayList<>();
        }

        if (filterBy.equals("teacher")) {
            return getAllTeachers();
        }

        return teachers.values().stream()
                .filter(teacher -> teacher.getHouse().toString().toLowerCase().equals(filterBy))
                .toList();
    }

}
