package com.knoldus;
import java.util.Scanner;
public class Application {
    public static void main(String[] args){
            int a,b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            Calculator ap = new Calculator();
            ap.calc(a,b);
    }
}
