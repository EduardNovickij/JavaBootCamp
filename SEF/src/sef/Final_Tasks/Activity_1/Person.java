package sef.Final_Tasks.Activity_1;

import sef.Final_Tasks.Bonus_Activity.Humanity;

public class Person extends Humanity {

    public Person(){
        name = " ";
        surname = " ";
        age = 0;
    }

    public Person(String name, String surname, int age){
        try {
            //Check if Name has any digits in it
            char[] check = name.toCharArray();
            for(char c:check){
                //Throw customized exception
                if(Character.isDigit(c)) throw new CustomizedException();
            }
            //Check if Surname has any digits in it
            check = surname.toCharArray();
            for(char c:check){
                //Throw customized exception
                if(Character.isDigit(c)) throw new CustomizedException();
            }
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
        catch(CustomizedException e){
            System.out.println(e.getMessage());
        }
    }

    public void Introduce(){
        System.out.println("My name is "+name+" and I am "+age+" years old");
    }

    public void setName(String name){
        try {
            //Check if Name has any digits in it
            char[] check = name.toCharArray();
            for(char c:check){
                //Throw customized exception
                if(Character.isDigit(c)) throw new CustomizedException();
            }
            this.name = name;
        }
        catch(CustomizedException e){
            System.out.println(e.getMessage());
        }
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        try {
            //Check if Surname has any digits in it
            char[] check = surname.toCharArray();
            for(char c:check){
                //Throw customized exception
                if(Character.isDigit(c)) throw new CustomizedException();
            }
            this.surname = surname;
        }
        catch(CustomizedException e){
            System.out.println(e.getMessage());
        }
    }

    public String getSurname(){
        return surname;
    }
}
