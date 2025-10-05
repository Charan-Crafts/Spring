package com.constructorInjection;

public class Student {

    StudentDetails studentDetails ;

    public Student(StudentDetails studentDetails){
        this.studentDetails=studentDetails;
    }

    public  void displayStudentDetails(){

        System.out.println("Student Details : "+studentDetails.getStudentName()+" "+studentDetails.getStudentRollNumber());
    }
}
