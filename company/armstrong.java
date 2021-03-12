package com.company;

public class armstrong {
    static void num(int n) {
        int sum = 0;
        int total = 0;
        int replicate=n;
        while (n > 0) {
            total = n % 10;
            sum += total * total * total;
            n /= 10;
        }
        System.out.println(sum);
        if (sum == replicate) {
            System.out.println("Given "+replicate+" is Armstrong");
        } else {
            System.out.println("Given "+replicate+" is not Armstrong");
        }
    }
    public static void main(String[] args) {
        num(15);
    }
}
