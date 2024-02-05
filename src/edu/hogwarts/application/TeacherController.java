package edu.hogwarts.application;


import edu.hogwarts.data.HogwartsTeacher;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TeacherController {

    private Map<Integer, HogwartsTeacher> teachers;


    public TeacherController() {
        teachers = new HashMap<>();
    }

    public void createTeacher(HogwartsTeacher teacher) {

    }

    public HogwartsTeacher getTeacher(int id) {
        return null;
    }

    public Collection<HogwartsTeacher> getAllTeachers() {
        return teachers.values();
    }

    public void updateTeacher(int id, HogwartsTeacher teacher) {

    }

    public void deleteStudent(int id) {

    }

}
