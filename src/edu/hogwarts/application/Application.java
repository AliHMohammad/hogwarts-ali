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
        studentController = new StudentController();
        teacherController = new TeacherController();
        userInterface = new UserInterface(studentController, teacherController);
    }

    public static void main(String[] args) {
        System.out.println("Part2");
        new Application().start();
    }

    public void start() {
        new InitApp(studentController, teacherController).createData();
        userInterface.run();
    }

}
