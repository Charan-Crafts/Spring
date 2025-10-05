package com.tightcoupling;

public class Manager {
    Mysql mysql = new Mysql();
    Mongo mongo = new Mongo();
    Postgres postgres = new Postgres();

    public String getMysqlStudents(){
        return mysql.getStudentData();
    }
    public String getMongoStudents(){
        return mongo.getStudentDetails();
    }

    public String getPostgresStudents(){
        return postgres.getStudentDetails();
    }
}
