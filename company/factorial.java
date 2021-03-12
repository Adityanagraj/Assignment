package com.company;
import  java.util.Scanner;
public class factorial {
    static void fact(int n){
        int sum=1;
        int temp=0;
        while(n>0){
            sum*=n;
            n=n-1;
        }
        System.out.println("The factorial of given number is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the Number");
        int n=sc.nextInt();
        fact(n);
    }
}
