
package arrays;

import java.util.Scanner;

public class Matrix_addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // take value  of rows and  columns
        System.out.print("Enter the value of rows :- ");
        int rows = sc.nextInt();

        System.out.print("Enter the value of rows :- ");
        int columns = sc.nextInt();
        // Declares, creates, and initializes a 2D array
        int[][] arr1 = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // display array1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(" " + arr1[i][j]);

            }
            System.out.println();
        }

        // Declares, creates, and initializes a 2D array

        int[][] arr2 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        //display array2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(" " + arr2[i][j]);
            }
            System.out.println();
        }


    }

}
