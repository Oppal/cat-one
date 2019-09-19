package com.ics.demo.models;

public class MockLecturer {
public long id;

private String studentNumber;

    public MockLecturer(long id, String studentNumber) {
        this.id = id;
        this.studentNumber = studentNumber;
    }

    public MockLecturer(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "MockLecturer{" +
                "id=" + id +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }
}
