package edu.hogwarts.application;



import edu.generic.Person;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.SortAndFilter;

import java.util.*;

public class StudentController implements SortAndFilter<HogwartsStudent> {


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
    public List<HogwartsStudent> sort(String sortBy, String sortDir) {
        List<HogwartsStudent> sortedStudents = new ArrayList<>();

        if (sortBy.equalsIgnoreCase("fornavn")){
            sortedStudents = students.values().stream()
                    .sorted(Comparator.comparing(student -> student.getFirstName()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("mellemnavn")) {
            sortedStudents = students.values().stream()
                    .sorted(Comparator.comparing(student -> student.getMiddleName()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("efternavn")) {
            sortedStudents = students.values().stream()
                    .sorted(Comparator.comparing(student -> student.getLastName()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("alder")) {
            sortedStudents = students.values().stream()
                    .sorted(Comparator.comparingInt(student -> student.getAge()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("hus")) {
            sortedStudents = students.values().stream()
                    .sorted(Comparator.comparing(student -> student.getHouse().toString()))
                    .toList();
        }


        if (sortDir.equalsIgnoreCase("d")) {
            sortedStudents = reverseList(sortedStudents);
        }

        return sortedStudents;
    }

    @Override
    public List<HogwartsStudent> filter(String filterBy) {
        if (filterBy.equals("teacher")) {
            return null;
        }

        if (filterBy.equals("student")) {
            return getAllStudents();
        }


        return students.values().stream()
                .filter(student -> student.getHouse().toString().toLowerCase().equals(filterBy))
                .toList();
    }


    public List<HogwartsStudent> reverseList(List<HogwartsStudent> list) {
        List<HogwartsStudent> reversedStudents = new ArrayList<>();

        for (int i = list.size()-1; i >= 0; i--) {
            reversedStudents.add(list.get(i));
        }

        return reversedStudents;
    }


}
