package com.javalab.sec18task;

/**
 * 직원 클래스
 * int id : 직원 아이디
 * String name 직원 이름
 * String position : 직원 직급
 * int salary : 직원 급여
 */
public class Employee {

    private int id;
    private String name;
    private String position;
    private int salary;

    public Employee(int id, String name, String position, int salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;

    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}








