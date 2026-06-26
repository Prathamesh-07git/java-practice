/*find the maximum and minimum in the array*/
package arrays;

import java.util.Scanner;

public class MaxMinInArray {

// method for find maximum  number in the array
    public static int maxInTheArray(int[] arr) {

        int max = arr[0];

        //for maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

    }
// method for finding minimum number in the array

    public static int minInTheArray(int[] arr){
        int min = arr[0];

        for(int i = 0;i<arr.length;i++){
            if (arr[i]<min){
                min =arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:- ");
        int size = sc.nextInt();


        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();


        System.out.println("The maximum element in the array is :- "+maxInTheArray(arr));
        System.out.println("The minimum element in the array is :- "+minInTheArray(arr));


    }
}
