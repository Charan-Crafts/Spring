package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection.xml");

        Student newStudent = (Student) context.getBean("student");

        newStudent.displayStudentDetails();
    }
}

