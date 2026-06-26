// draw a Square Fill Pattern using loops
/*
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *

outer loop = rows
inner loop = columns
* */

package patterns;

import java.util.Scanner;
public class SquareFillPattern {

    public static void main(String[] args){

        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
