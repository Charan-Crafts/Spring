package com.challenge1;

public class Mongo implements StudentDetails{
    @Override
    public String getStudentDetails() {
        return "Student Details are fetched from the Mongo Database";
    }
}
