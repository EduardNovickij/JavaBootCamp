package sef.module7.activity;

public class Driver {
    private String name;
    private Moving driversMoving;

    public Driver(String n){
        name = n;
    }

    public void setDriversMoving(Moving m){
        driversMoving = m;
    }

    public void driverStartsDriving(){
        System.out.print("Driver "+name+" ");
        driversMoving.Drive();
    }
}
