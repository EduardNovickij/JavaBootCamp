package sef.Final_Tasks.Activity_1;

import java.util.Comparator;

//Comparator to sort employees by Surname

public class EmployeeSurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSurname().compareTo(emp2.getSurname());
    }
}
