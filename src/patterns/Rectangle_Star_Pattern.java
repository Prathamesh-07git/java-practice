package patterns;
/*
 * * * * * *
 * * * * * *
 * * * * * *
*/

 import java.util.Scanner;
public class Rectangle_Star_Pattern {

    public static void main(String [] args){

        for (int i=0;i<3;i++){// rows
            for(int j=0;j<6;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
