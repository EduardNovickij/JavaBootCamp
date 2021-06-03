package sef.Final_Tasks.Activity_1;

import java.io.FileOutputStream;
import java.util.*;

public class FirstActivity {
    public static void main(String arg[]){
        //Create list to later display all employees, as well as sort them in the right order and write them to file
        List<Employee> employees = new ArrayList<>();
        //Some values for "random generator"
        String names[] = {"Eduard", "John", "Mike", "Valeriy", "Ilze", "Janis"};
        String surnames[] = {"Novickij", "Wood", "Carr", "Russell", "Hughes", "Warren"};
        String titles[] = {"Intern", "Employee", "Manager"};
        String company = "Accenture";
        for(int i = 0; i < 10; i++){
            //Create employees with "random" data
            Random rand = new Random();
            String name = names[rand.nextInt(6)];
            String surname = surnames[rand.nextInt(6)];
            String title = titles[rand.nextInt(3)];
            int age = rand.nextInt(100)+1;
            float salary_cents = (rand.nextInt(99)+1);
            float salary = (rand.nextInt(2401)+100)+ salary_cents/100;
            Employee employee = new Employee(name,surname,title,company,age,salary);
            employees.add(employee);
        }
        //Sort employees by their salary
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println("Employees sorted by Salary: ");
        //Display employees
        employees.forEach(Employee::Introduce);
        FileOutputStream fout;
        //Write employees in employees.txt file
        try {
            fout = new FileOutputStream("./src/sef/Final_Tasks/Bonus_Activity/employees.txt");
            for(Employee e : employees) {
                String line = e.getName() + " | " + e.getSurname() + " | " + e.getAge() + " | " + e.getJobTitle() + " | " + e.getCompany() + " | " + e.getSalary() + ";\n";
                byte[] Bytes = line.getBytes();
                fout.write(Bytes);
            }
                fout.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nEmployees sorted by Name and Surname: ");
        //Sort employees by their Name and Surname using comparators
        Collections.sort(employees, new EmployeeChainedComparator(
                new EmployeeNameComparator(),
                new EmployeeSurnameComparator())
        );
        //Display employees
        employees.forEach(Employee::Introduce);
    }
}
