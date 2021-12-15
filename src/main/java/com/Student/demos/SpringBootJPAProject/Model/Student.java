package com.Student.demos.SpringBootJPAProject.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity(name = "Student")
public class Student {

    @Id
    @Column(name = "studentId")
    int studentId;
    @Column(name = "studentName")
    String studentName;
    @Column(name = "stream")
    String stream;
    @Column(name = "grade")
    String grade;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(int studentId, String studentName, String stream, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.stream = stream;
        this.grade = grade;
    }
    public Student(){}
}
