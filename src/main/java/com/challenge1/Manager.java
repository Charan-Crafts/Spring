package com.challenge1;

public class Manager {

    StudentDetails studentDetails;

    public Manager(StudentDetails studentDetails){
        this.studentDetails = studentDetails;
    }

    public String displayStudents(){
        return studentDetails.getStudentDetails();
    }

}
