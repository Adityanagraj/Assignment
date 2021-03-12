package com.company;
 class sum {
     static int totalsum_nonrecuursive(int arr[], int n) {
         int total = 0;
         for (int i = 0; i < arr.length; i++) {
             total += arr[i];
         }
         return total;
     }

     static int totalsum_recuursive(int[] arr, int n) {
         if (n <= 0) {
             return arr[n];
         } else {
             return arr[n] + totalsum_recuursive(arr, n - 1);
         }
     }


     public static void main(String[] args) {
         int arr[] = {1, 2, 3, 4, 5};
         int n = arr.length;
         System.out.println("Non_recuursive_sum "+totalsum_nonrecuursive(arr,n));
         System.out.println("Recuursive_sum "+totalsum_recuursive(arr,n-1));
     }
 }