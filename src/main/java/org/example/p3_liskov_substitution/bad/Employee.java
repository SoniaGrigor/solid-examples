package org.example.p3_liskov_substitution.bad;

public abstract class Employee
{
    public String getWorkDetails(Integer employeeId) {
        return "Base Work";
    }

    public String getEmployeeDetails(Integer employeeId) {
        return "Base Employee";
    }
}