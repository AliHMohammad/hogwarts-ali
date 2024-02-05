package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;

import java.util.ArrayList;
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
        List<HogwartsPerson> hogwartsPeople = new ArrayList<>();
        createTestData();

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

            } else if (inputs.get(0).equals("a")) {
                //Vis alle
                hogwartsPeople = getAllHogwartsPeople();
            } else {
                //filtrering
                String filterBy = inputs.get(0);
                List<HogwartsStudent> students = studentController.filter(filterBy);
                List<HogwartsTeacher> teachers = teacherController.filter(filterBy);

                if (students != null) hogwartsPeople.addAll(students);
                if (teachers != null) hogwartsPeople.addAll(teachers);
            }

            //Print table header
            userInterface.printTableHeader();
            //Print table body
            userInterface.printTableBody(hogwartsPeople);
            //Clear hogwartsPeople List before starting over
            hogwartsPeople.clear();
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
