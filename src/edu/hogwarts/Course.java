package edu.hogwarts;

import java.util.ArrayList;

public class Course {

    private Subject subject;
    private Teacher teacher;
    private ArrayList<Student> students;
    private ArrayList<TeachingMaterial> materials;

    public Course(Subject subject, Teacher teacher, ArrayList<Student> students, ArrayList<TeachingMaterial> materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = materials;
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
}
