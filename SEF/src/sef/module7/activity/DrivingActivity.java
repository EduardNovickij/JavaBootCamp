package sef.module7.activity;

public class DrivingActivity {
    public static void  main(String arg[]){
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Driver driver1 = new Driver("Eduard");
        Driver driver2 = new Driver("Novickij");
        driver1.setDriversMoving(car);
        driver2.setDriversMoving(motorcycle);
        driver1.driverStartsDriving();
        driver2.driverStartsDriving();
    }
}
