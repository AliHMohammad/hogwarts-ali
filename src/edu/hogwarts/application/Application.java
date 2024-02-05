package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;

import java.util.List;

public class Application {

    private UserInterface userInterface;
    private StudentController studentController;
    private TeacherController teacherController;
    public Application() {
        userInterface = new UserInterface();
        studentController = new StudentController();
        teacherController = new TeacherController();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }


    public void run() {
        createTestData();
        //Mere her
    }

    public void createTestData() {
        InitApp testData = new InitApp();
        List<HogwartsStudent> studentsArr = testData.createStudentsArr();
        List<HogwartsTeacher> teachersArr = testData.createTeachersArr();

    }
}
