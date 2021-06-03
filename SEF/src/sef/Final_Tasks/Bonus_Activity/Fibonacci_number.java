package sef.Final_Tasks.Bonus_Activity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci_number {
    static Scanner obj =new Scanner(System.in);
    public static void main(String arg[]){
        //Get users input from console as well as check if it is correct
        int number = checkNumber();
            while (number == 0) {
                System.out.println("Number should be >= 1");
                obj.nextLine();
                number = checkNumber();
            }
        printFibanacci(number);
    }

    public static int checkNumber(){
        try{
            System.out.print("Enter Number: ");
            return obj.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }
    }

    public static void printFibanacci(int count_limit){
        int count = 1;
        int previous1 = 0;
        int previous2 = 1;
        while(count <= count_limit){
            if(count == 1) System.out.print(previous1+" ");
            if(count == 2) System.out.print(previous2+" ");
            if(count > 2){
                System.out.print((previous1+previous2)+" ");
                int temp = previous2;
                previous2 = previous1 + previous2;
                previous1 = temp;
            }
            count++;
        }
    }
}
