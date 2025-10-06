package com.component;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("Charan")
    private String employeeName;

    @Value("123123")
    private String employeeId;

    @Value("1231231")
    private double empolyeeSalary;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getEmpolyeeSalary() {
        return empolyeeSalary;
    }

    public void setEmpolyeeSalary(double empolyeeSalary) {
        this.empolyeeSalary = empolyeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", empolyeeSalary=" + empolyeeSalary +
                '}';
    }
}
