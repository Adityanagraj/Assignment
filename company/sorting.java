package com.company;
import java.util.Scanner;
public class sorting {
    static void bubble_sort(int arr[],int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        for(int x:arr) {
            System.out.println("the elements of arr are "+x);
        }
    }
    static void selection_sort(int arr[],int n){
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int y:arr) {
            System.out.println("the elements of arr are "+y);
        }

    }


    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
        bubble_sort(arr,n);
        selection_sort(arr,n);
    }
}
