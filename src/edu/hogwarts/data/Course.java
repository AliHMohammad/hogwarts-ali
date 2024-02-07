package edu.hogwarts.data;

import edu.generic.Student;
import edu.generic.Teacher;

import java.util.ArrayList;

public class Course {

    private Subject subject;
    private Teacher teacher;
    private ArrayList<Student> students;
    private ArrayList<TeachingMaterial> materials;

    public Course(Subject subject, Teacher teacher) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        this.materials = new ArrayList<>();
    }

    public Course() {

    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<TeachingMaterial> getMaterials() {
        return materials;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setMaterials(ArrayList<TeachingMaterial> materials) {
        this.materials = materials;
    }


    public void addStudent(HogwartsStudent student) {
        this.students.add(student);
    }

    public void addAllStudents(ArrayList<HogwartsStudent> students) {
        for (HogwartsStudent student :
                students) {
            addStudent(student);
        }
    }

    public void addMaterial(TeachingMaterial material) {
        this.materials.add(material);
    }

    public void addMaterials(ArrayList<TeachingMaterial> materials) {
        for (TeachingMaterial material :
                materials) {
            addMaterial(material);
        }
    }

    public void addMaterials(TeachingMaterial... materials) {
        for (TeachingMaterial material :
                materials) {
            addMaterial(material);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", students=" + students +
                ", materials=" + materials +
                '}';
    }
}
