package com.autowireByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationAutowireByConstructor.xml");

        Student student = (Student) context.getBean("student");

        student.displayStudentInfo();
    }
}
