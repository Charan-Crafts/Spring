package com.challenge1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // Mongo
//        Mongo mongo = new Mongo();

        // Mysql

//        Mysql mysql = new Mysql();
//
//        Manager manager = new Manager(mysql);
//
//        System.out.println(manager.displayStudents());

        ApplicationContext context = new ClassPathXmlApplicationContext("challenge1.xml");

        Manager managerForMysql = (Manager) context.getBean("mysqlManager");

        System.out.println(managerForMysql.displayStudents());

        Manager managerForMongo = (Manager) context.getBean("mongoManager");

        System.out.println(managerForMongo.displayStudents());

        Manager managerForPostgres = (Manager)context.getBean("postgresManager");

        System.out.println(managerForPostgres.displayStudents());



    }
}
