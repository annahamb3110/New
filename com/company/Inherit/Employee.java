package Inherit;

import java.util.ArrayList;
import java.util.Objects;

public class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        System.out.println("Start of creating employee");
        this.fullName = fullName;
        this.salary = salary;
        System.out.println("End of creating employee");
    }

    public Employee() {
        System.out.println("In default constructor");
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Employee)) {
            Employee e = (Employee) o;
            return (this.salary == e.salary);

        }
        return false;
     }



}

