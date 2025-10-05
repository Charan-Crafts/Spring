package com.looseCoupling;

public class Manager {

    private StudentDetails studentDetails;

    public Manager(StudentDetails studentDetails){
        this.studentDetails = studentDetails;
    }
    public String studentDetails(){
        return studentDetails.getStudentDetails();
    }
}
