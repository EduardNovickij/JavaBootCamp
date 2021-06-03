package sef.Final_Tasks.Activity_1;

import sef.Final_Tasks.Bonus_Activity.Humanity;

public class Employee extends Humanity {
    private String jobTitle, company;
    private float salary;

    public Employee(){
        name = " ";
        surname = " ";
        jobTitle = " ";
        company = " ";
        age = 0;
        salary = 0;
    }

    public Employee(String name, String surname, String jobTitle, String company, int age, float salary){
        this.name = name;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.company = company;
        this.age = age;
        this.salary = salary;
    }
//Introduce function (modified message a little bit so it would be easier to see what order employees are printed in)
    public void Introduce(){
        System.out.println("My name is "+name+" and I am "+age+" years old.I am work as "+jobTitle+" in "+company+" (Salary: "+salary+", Surname: "+surname+")");
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return company;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public float getSalary(){
        return salary;
    }
}
