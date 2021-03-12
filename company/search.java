package com.company;
import java.util.Scanner;
public class search {
    static int linear_search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    static void binarySearch(int arr[],int key){
        int first=0;
        int last=arr.length-1;
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int key=sc.nextInt();
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println(linear_search(a,n,key));
        binarySearch(a,key);

        }
    }

