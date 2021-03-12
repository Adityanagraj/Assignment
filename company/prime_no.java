package com.company;

import java.util.Scanner;
import java.util.*;
public class prime_no {
    static boolean prime(int n) {
        boolean flag = false;
        int temp;
        for (int i = 2; i < n; i++) {
            temp = n % i;
            if (temp == 0) {
                flag = false;
                return flag;
            }
        }

        flag = true;

        return flag;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the Number");
        int n = sc.nextInt();
        if (prime(n) == true) {
            System.out.println("It is a Prime no");
        }
        if (prime(n) == false) {
            System.out.println("It is not a Prime no");
        }
        int x, y;
        System.out.println("Please Enter the range ");
        x = sc.nextInt();
        y = sc.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for (int i = x; i < y; i++) {
            int z = 0;
            if (prime(i) == true) {
                list.add(i);
            }
        }
        for (int num:list) {
            System.out.println(num);
        }
    }
}