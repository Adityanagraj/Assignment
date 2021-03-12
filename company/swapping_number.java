package com.company;
import java.util.Scanner;
public class swapping_number {
    public void swap_with_temp(int x,int y){
        System.out.println("The value of x and y are "+x+" "+y);
        int temp=0;
        temp=x;
        x=y;
        y=temp;
        System.out.println("The value of x and y are "+x+" "+y);
    }
    public void swap_without_temp(int x,int y){
        System.out.println("The value of x and y are "+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("The value of x and y are "+x+" "+y);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        swapping_number sn=new swapping_number();
        sn.swap_with_temp(x,y);
        sn.swap_without_temp(x,y);
    }
}
