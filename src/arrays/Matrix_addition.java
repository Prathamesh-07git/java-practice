
package arrays;
import java.util.Scanner;
public class Matrix_addition {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the value of rows :- ");
        int rows =sc.nextInt();

        System.out.print("Enter the value of rows :- ");
        int columns=sc.nextInt();

        int [][] arr1 = new int [rows][columns];


        for(int i = 0;i<arr1.length;i++){
            for (int j= 0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }


//        for(int[] matrixAdd : arr1){
//            System.out.println(matrixAdd);
//        }  gives garbage values

for(int i = 0;i<arr1.length;i++){
    for (int j =0;j<arr1[i].length;j++){
        System.out.print(" "+arr1[i][j]);
    }
    System.out.println();
}
    }

}
