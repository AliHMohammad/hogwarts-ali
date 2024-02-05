package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private UserInterface userInterface;
    private StudentController studentController;
    private TeacherController teacherController;
    private List<HogwartsPerson> hogwartsPeople;

    public Application() {
        userInterface = new UserInterface();
        studentController = new StudentController();
        teacherController = new TeacherController();
        hogwartsPeople = new ArrayList<>();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    public void start() {
        createTestData();
        // updateHogwartsPeople();

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
                getAllHogwartsPeople();
            } else {
                //filtrering
                String filterBy = inputs.get(0);
                List<HogwartsStudent> students = studentController.filter(filterBy);
                List<HogwartsTeacher> teachers = teacherController.filter(filterBy);

                if (students != null) hogwartsPeople.addAll(students);
                if (teachers != null) hogwartsPeople.addAll(teachers);
            }

            //Print table header
            //Print table body
            userInterface.printTableHeader();
            userInterface.printTableBody(hogwartsPeople);
            clearHogwartsPeople();
        }
    }

    public void getAllHogwartsPeople() {
        hogwartsPeople.clear();

        List<HogwartsStudent> students = studentController.getAllStudents();
        List<HogwartsTeacher> teachers = teacherController.getAllTeachers();

        hogwartsPeople.addAll(students);
        hogwartsPeople.addAll(teachers);
    }

    public void clearHogwartsPeople() {
        hogwartsPeople.clear();
    }

    public void createTestData() {
        InitApp testData = new InitApp();
        List<HogwartsStudent> studentsArr = testData.createStudentsArr();
        List<HogwartsTeacher> teachersArr = testData.createTeachersArr();

        for (int i = 0; i < teachersArr.size(); i++) {
            teacherController.createTeacher(teachersArr.get(i));
        }

        for (int i = 0; i < studentsArr.size(); i++) {
            studentController.createStudent(studentsArr.get(i));
        }
    }

    public List<HogwartsPerson> getHogwartsPeople() {
        return hogwartsPeople;
    }
}
