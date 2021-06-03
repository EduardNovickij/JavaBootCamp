package sef.Final_Tasks.Activity_2;

public class Calculator {
    public int Add(int x, int y){
        return x+y;
    }

    public int Subtract(int x, int y){
        return x-y;
    }

    public int Multiply(int x, int y){
        return x*y;
    }

    public float Divide(float x, float y){
        if(x == 0 || y == 0) return 0;
        else return x/y;
    }
}
