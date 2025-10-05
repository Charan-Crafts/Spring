package com.looseCoupling;

public class Postgres implements StudentDetails{
    @Override
    public String getStudentDetails() {
        return "Student Details from POSTGRES";
    }
}
