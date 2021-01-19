package com.knoldus;
import java.util.Scanner;
public class Calculator {
    public void calc(int a,int b){
        String op;
        System.out.println("Enter the operation\n");
        Scanner sc = new Scanner(System.in);
        op = sc.nextLine();
        switch(op){
            case "+": System.out.println(a+b);
            break;
            case "-": System.out.println(a-b);
            break;
            case "*": System.out.println(a*b);
            break;
            case "/": try{System.out.println(a/b);}
                      catch(ArithmeticException e){
                          System.out.println("Cannot divide by Zero");
                      }
            break;
        }
    }
}
