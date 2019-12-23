package com.varma.ExceptionHandling;

/**
 * Created by varma on 12/22/2019.
 */
public class SampleFinallyBlock {

    public static void main(String args[]){
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("Try block");
        }catch(Exception e){
            System.out.println("Catch block");
            throw new ArithmeticException();
        }finally {
            System.out.println("Finally block");
        }
    }
}
