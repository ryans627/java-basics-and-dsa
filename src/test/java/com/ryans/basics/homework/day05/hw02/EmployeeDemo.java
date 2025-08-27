package com.ryans.basics.homework.day05.hw02;

public class EmployeeDemo {
    public static void employeeAct(Employee e) {
        e.work();
        e.sleep();
    }

    public static void main(String[] args) {
        Employee coder = new Coder();
        coder.work();

        Employee tester = new Tester();
        tester.work();

        Employee manager = new Manager();
        manager.work();
        System.out.println("--------");

        employeeAct(coder);
        employeeAct(tester);
        employeeAct(manager);
    }
}
