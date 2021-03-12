package com.company;
import java.util.Scanner;
public class largest_of_three_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(l>m && l>n){
            System.out.println(l+" is greatest of all element");
        }
        else if(m>l && m>n){
            System.out.println(m+" is grestest of all element");
        }
        else{
            System.out.println(n+" is greatest of all element");
        }
    }
}
