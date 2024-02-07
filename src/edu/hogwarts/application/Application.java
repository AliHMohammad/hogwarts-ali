package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {

    private final UserInterface userInterface;
    private final StudentController studentController;
    private final TeacherController teacherController;

    public Application() {
        userInterface = new UserInterface();
        studentController = new StudentController();
        teacherController = new TeacherController();
    }

    public static void main(String[] args) {
        System.out.println("Part2");
        Application application = new Application();
        application.start();
    }

    public void start() {
        createTestData();

        userInterface.printWelcome();
        while (true) {
            List<HogwartsPerson> hogwartsPeople = new ArrayList<>();
            List<String> inputs = userInterface.run();


            if (inputs.isEmpty()) {
                userInterface.printUnknownCommand();
                continue;
            } else if (inputs.get(0).equals("x")) {
                userInterface.printFarewell();
                break;
            }


            if (inputs.size() == 2) {
                //Sortering
                String sortBy = inputs.get(0);
                String sortDir = inputs.get(1);

                hogwartsPeople.addAll(studentController.getAllStudents());
                hogwartsPeople.addAll(teacherController.getAllTeachers());
                hogwartsPeople = sort(hogwartsPeople, sortBy, sortDir);
            } else if (inputs.get(0).equals("a")) {
                //Vis alle
                hogwartsPeople.addAll(studentController.getAllStudents());
                hogwartsPeople.addAll(teacherController.getAllTeachers());
            } else {
                //filtrering
                String filterBy = inputs.get(0);
                hogwartsPeople.addAll(studentController.filter(filterBy));
                hogwartsPeople.addAll(teacherController.filter(filterBy));
            }

            //Print table header
            userInterface.printTableHeader();
            //Print table body
            userInterface.printTableBody(hogwartsPeople);
        }
    }

    public List<HogwartsPerson> sort(List<HogwartsPerson> persons, String sortBy, String sortDir) {
        List<HogwartsPerson> sortedHogwartsPersons = new ArrayList<>();


        if (sortBy.equalsIgnoreCase("fornavn")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparing(person -> person.getFirstName()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("mellemnavn")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparing(person -> person.getMiddleName()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("efternavn")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparing(person -> person.getLastName()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("alder")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparingInt(person -> person.getAge()))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("hus")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparing(person -> person.getHouse().toString()))
                    .toList();
        }


        if (sortDir.equalsIgnoreCase("d")) {
            //Descending. reverse arr.
            sortedHogwartsPersons = reverseList(sortedHogwartsPersons);
        }

        return sortedHogwartsPersons;
    }

    public List<HogwartsPerson> reverseList(List<HogwartsPerson> list) {
        List<HogwartsPerson> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }

    public void createTestData() {
        InitApp testData = new InitApp();
        List<HogwartsStudent> studentsArr = testData.createStudentsArr();
        List<HogwartsTeacher> teachersArr = testData.createTeachersArr();

        for (HogwartsTeacher teacher : teachersArr) {
            teacherController.createTeacher(teacher);
        }

        for (HogwartsStudent student : studentsArr) {
            studentController.createStudent(student);
        }
    }

}
