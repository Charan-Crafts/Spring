package com.looseCoupling;

public class Mysql implements StudentDetails{
    @Override
    public String getStudentDetails() {
        return "Student Details from Mysql";
    }
}
