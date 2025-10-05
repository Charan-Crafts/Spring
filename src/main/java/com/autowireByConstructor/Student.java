package com.autowireByConstructor;

public class Student {

    StudentDetails studentDetails ;

    public Student(StudentDetails studentDetails){
        this.studentDetails=studentDetails;
    }

    public void displayStudentInfo(){
        System.out.println(studentDetails.toString());
    }
}
