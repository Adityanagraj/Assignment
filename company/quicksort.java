package com.company;
import java.util.*;
public class quicksort {
        static int partition(int arr[],int low,int high) {
            int pivot=arr[high];
            int i=low-1;
            for(int j=low;j<high;j++) {
                if (arr[j]<=pivot) {
                    i++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
            //to swap the pivot with the current element
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
            return i+1;
        }
        static void sort(int arr[],int low,int high ) {
            if(low<high) {
                int pi=partition(arr,low,high);

                sort(arr,low,pi-1);
                sort(arr,pi+1,high);
            }
        }
        static void print(int arr[]) {
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n;
            n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            sort(arr,0,n-1);
            print(arr);
            sc.close();
        }
    }

