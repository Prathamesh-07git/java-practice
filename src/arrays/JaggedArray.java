package arrays;

import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of rows
        System.out.print("Enter number of rows: ");
        int rowSize = sc.nextInt();

        int[][] arr = new int[rowSize][];

        // Create rows
        System.out.println("\n===== Enter Column Size for Each Row =====");

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Columns in Row " + i + " : ");
            int col = sc.nextInt();

            arr[i] = new int[col];
        }

        // Input Elements
        System.out.println("\n===== Enter Elements =====");

        for (int i = 0; i < arr.length; i++) {

            System.out.println("\nRow " + i + ":");

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("Element [" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Print Jagged Array
        System.out.println("\n========== JAGGED ARRAY ==========");

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Row " + i + " -> ");

            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("%4d", arr[i][j]);
            }

            System.out.println();
        }

        sc.close();
    }
}