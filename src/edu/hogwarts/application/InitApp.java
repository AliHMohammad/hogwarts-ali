package edu.hogwarts.application;

import edu.hogwarts.data.EmploymentType;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.House;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InitApp {

    private List<House> houses;
    private StudentController studentController;
    private TeacherController teacherController;

    public InitApp(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
        houses = new ArrayList<>();
    }

    public void createData() {
        initiateHouses();
        createStudentsArr();
        createTeachersArr();
    }

    public void createStudentsArr() {
        ArrayList<HogwartsStudent> students = new ArrayList<>();

        //Gryffindor
        students.add(new HogwartsStudent("Lavender Brown", "01-09-1979", 1991, 1998, false, houses.get(1), false));
        students.add(new HogwartsStudent("Harry Potter", "31-07-1980", 1991, 1998, true, houses.get(1), true));
        students.add(new HogwartsStudent("Hermione Granger", "19-09-1979", 1991, 1998, true, houses.get(1), true));
        students.add(new HogwartsStudent("Neville Longbottom", "30-07-1980", 1991, 1998, true, houses.get(1), false));

        //Hufflepuff
        students.add(new HogwartsStudent("Hannah Abbott", "01-09-1979", 1991, 1998, true, houses.get(2), true));
        students.add(new HogwartsStudent("Susan Bones", "15-09-1979", 1991, 1998, true, houses.get(2), true));
        students.add(new HogwartsStudent("Justin Finch-Fletchley", "20-09-1979", 1991, 1998, true, houses.get(2), true));

        //Ravenclaw
        students.add(new HogwartsStudent("Michael Cornor", "21-09-1979", 1991, 1998, true, houses.get(3), false));
        students.add(new HogwartsStudent("Sue Li", "30-09-1979", 1991, 1998, true, houses.get(3), false));
        students.add(new HogwartsStudent("Terry Boot", "21-04-1980", 1991, 1998, true, houses.get(3), false));

        //Slytherin
        students.add(new HogwartsStudent("Vincent Crabbe", "01-09-1980", 1991, 1998, false, houses.get(0), false));
        students.add(new HogwartsStudent("Draco Malfoy", "05-06-1980", 1991, 1998, true, houses.get(0), true));
        students.add(new HogwartsStudent("Gregory Goyle", "10-09-1980", 1991, 1998, true, houses.get(0), false));

        for (HogwartsStudent student : students) {
            studentController.createStudent(student);
        }
    }

    public void createTeachersArr() {
        ArrayList<HogwartsTeacher> teachers = new ArrayList<>();

        teachers.add(new HogwartsTeacher("Albus Percival Wulfric Brian Dumbledore", "16-8-1881", EmploymentType.HEADMASTER, LocalDate.now(), null, houses.get(1), false));
        teachers.add(new HogwartsTeacher("Minerva McGonegall", "04-10-1890", EmploymentType.HEAD_OF_GRYFFINDOR_HOUSE, LocalDate.now(), null, houses.get(1), true));
        teachers.add(new HogwartsTeacher("Pomona Sprout", "15-05-1910", EmploymentType.HEAD_OF_HUFFLEPUFF_HOUSE, LocalDate.now(), null, houses.get(2), true));
        teachers.add(new HogwartsTeacher("Filius Flitwick", "17-10-1958", EmploymentType.HEAD_OF_RAVENCLAW_HOUSE, LocalDate.now(), null, houses.get(3), true));
        teachers.add(new HogwartsTeacher("Severus Snape", "09-01-1960", EmploymentType.HEAD_OF_SLYTHERIN_HOUSE, LocalDate.now(), null, houses.get(0), true));
        teachers.add(new HogwartsTeacher("Horace Slughorn", "28-04-1913", EmploymentType.TEACHER, LocalDate.of(2000, 12, 12), null, houses.get(0), false));

        for (HogwartsTeacher teacher : teachers) {
            teacherController.createTeacher(teacher);
        }
    }

    private void initiateHouses() {
        this.houses.add(new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"}));
        this.houses.add(new House("Gryffindor", "Godric Gryffindor", new String[]{"Scarlet", "Gold"}));
        this.houses.add(new House("Hufflepuff", "Helga Hufflepuff", new String[]{"Yellow", "Black"}));
        this.houses.add(new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blue", "Bronze"}));
    }
}
