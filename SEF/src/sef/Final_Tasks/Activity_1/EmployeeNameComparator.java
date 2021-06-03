package sef.Final_Tasks.Activity_1;

import java.util.Comparator;

//Comparator to sort employees by Name

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}
