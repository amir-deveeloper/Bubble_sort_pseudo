package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOfRange;

public class Main {


    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int k = 0;
        int s = Math.abs(k - num[0]);
        int ans = num[0];


        int n = num.length;
        int counter = 0;
        for (int i = 0; i < n; i++){
            int a;
            a = Math.abs(k - num[i]);
            if (a < s){
                s = a;
                ans = num[i];
            }
        }
        System.out.println(ans);

    }






        public static void bubbleSort(int[] arr){

        /*

            int n = arr.length;
            int temp;
            int counter = 0;
            for (int i = 0; i < n-1; i++){
                for (int j = 0; j < n-1; j++){
                    counter++;
                    if (arr[j] > arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }

                }
            }
            System.out.println(counter);
            System.out.println(Arrays.toString(arr));

         */
/*
            int n = arr.length;
            int temp;
            for (int i = 0; i < n-1; i++){
                int min = i;
                for (int j = i+1; j < n; j++){

                    if (arr[j] < arr[min]){
                        min = j;
                    }
                }

                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;



            }
            System.out.println(Arrays.toString(arr));

 */




        }


    }

