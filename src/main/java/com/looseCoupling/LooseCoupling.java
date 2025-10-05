package com.looseCoupling;

public class LooseCoupling {

    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        Postgres postgres = new Postgres();
        Manager manager = new Manager(postgres);
        System.out.println(manager.studentDetails());
    }
}
