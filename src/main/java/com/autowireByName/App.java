package com.autowireByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =  new ClassPathXmlApplicationContext("ApplicationAutowireByName.xml");

        Car myCar = (Car) context.getBean("car");
        myCar.displayCarInfo();
    }
}
