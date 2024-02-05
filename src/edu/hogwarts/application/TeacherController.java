package edu.hogwarts.application;


import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.SortAndFilter;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherController implements SortAndFilter<HogwartsTeacher> {

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
    public List<HogwartsTeacher> sort(List<HogwartsTeacher> arr, String sortDir, String sortBy) {
        return null;
    }

    @Override
    public List<HogwartsTeacher> filter(String filterBy) {
        if (filterBy.equals("student")) {
            return null;
        }

        if (filterBy.equals("teacher")) {
            return getAllTeachers();
        }

        return teachers.values().stream()
                .filter(teacher -> teacher.getHouse().toString().toLowerCase().equals(filterBy))
                .toList();
    }
}
