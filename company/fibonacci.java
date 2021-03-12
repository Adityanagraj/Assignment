package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter range of Fibonacci series");
        int range = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while (a < range) {
            list.add(a);
            int temp=a;
            a = b;
            b = temp+ b;
        }
        for (int element : list) {
            System.out.print(element+" ");
        }
        System.out.println("\nEnter no to be searched");
        int num=sc.nextInt();
        System.out.println(list.contains(num));
    }
}
