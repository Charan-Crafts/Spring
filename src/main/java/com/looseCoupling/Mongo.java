package com.looseCoupling;

public class Mongo implements StudentDetails{

    @Override
    public String getStudentDetails() {
        return "Student Details from Mongo DB";
    }

}
