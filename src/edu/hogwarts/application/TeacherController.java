package edu.hogwarts.application;


import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.SortAndFilter;

import java.util.*;

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
    public List<HogwartsTeacher> sort(String sortBy, String sortDir) {
        List<HogwartsTeacher> sortedTeachers = new ArrayList<>();


        if (sortBy.equalsIgnoreCase("fornavn")){
            sortedTeachers = teachers.values().stream()
                    .sorted(Comparator.comparing(teacher -> teacher.getFirstName()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("mellemnavn")) {
            sortedTeachers = teachers.values().stream()
                    .sorted(Comparator.comparing(teacher -> teacher.getMiddleName()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("efternavn")) {
            sortedTeachers = teachers.values().stream()
                    .sorted(Comparator.comparing(teacher -> teacher.getLastName()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("alder")) {
            sortedTeachers = teachers.values().stream()
                    .sorted(Comparator.comparingInt(teacher -> teacher.getAge()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("hus")) {
            sortedTeachers = teachers.values().stream()
                    .sorted(Comparator.comparing(teacher -> teacher.getHouse().toString()))
                    .toList();
        }


        if (sortDir.equalsIgnoreCase("d")) {
            sortedTeachers = reverseList(sortedTeachers);
        }

        return sortedTeachers;
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

    public List<HogwartsTeacher> reverseList(List<HogwartsTeacher> list) {
        List<HogwartsTeacher> reversedTeachers = new ArrayList<>();

        for (int i = list.size()-1; i >= 0; i--) {
            reversedTeachers.add(list.get(i));
        }

        return reversedTeachers;
    }
}
