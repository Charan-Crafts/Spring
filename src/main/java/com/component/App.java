package com.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationComponent.xml");

        Employee employee1 = context.getBean("employee",Employee.class);

        System.out.println(employee1.toString());
    }
}
