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
        Application application = new Application();
        application.start();
    }

    public void start() {
        createTestData();
        List<HogwartsPerson> hogwartsPeople;

        userInterface.printWelcome();
        while (true) {
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

                hogwartsPeople = getAllHogwartsPeople();
                hogwartsPeople = sort(hogwartsPeople, sortBy, sortDir);
            } else if (inputs.get(0).equals("a")) {
                //Vis alle
                hogwartsPeople = getAllHogwartsPeople();
            } else {
                //filtrering
                String filterBy = inputs.get(0);
                hogwartsPeople = getFilteredHogwartsPeople(filterBy);
            }

            //Print table header
            userInterface.printTableHeader();
            //Print table body
            userInterface.printTableBody(hogwartsPeople);
            //Clear hogwartsPeople List before starting over

        }
    }

    public ArrayList<HogwartsPerson> getAllHogwartsPeople() {
        ArrayList<HogwartsPerson> arr = new ArrayList<>();

        List<HogwartsStudent> students = studentController.getAllStudents();
        List<HogwartsTeacher> teachers = teacherController.getAllTeachers();

        arr.addAll(students);
        arr.addAll(teachers);

        return arr;
    }

    public ArrayList<HogwartsPerson> getFilteredHogwartsPeople(String filterBy) {
        ArrayList<HogwartsPerson> arr = new ArrayList<>();

        List<HogwartsStudent> students = studentController.filter(filterBy);
        List<HogwartsTeacher> teachers = teacherController.filter(filterBy);

        if (students != null) arr.addAll(students);
        if (teachers != null) arr.addAll(teachers);

        return arr;
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

}
