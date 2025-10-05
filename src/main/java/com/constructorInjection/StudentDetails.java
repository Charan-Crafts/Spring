package com.constructorInjection;

public class StudentDetails {

    private String studentName;

    private String studentRollNumber;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(String studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNumber='" + studentRollNumber + '\'' +
                '}';
    }
}
