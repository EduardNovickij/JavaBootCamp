package sef.Final_Tasks.Activity_1;

public class Students {
    private String schoolName;

    public Students(){
        schoolName = " ";
    }

    public Students(String schoolName){
        this.schoolName = schoolName;
    }

    public void Introduce(){
        System.out.println("I am study in university "+schoolName);
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
}
