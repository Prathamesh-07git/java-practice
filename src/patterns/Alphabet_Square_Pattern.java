package patterns;
/*
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
* */
import java.util.*;
public class Alphabet_Square_Pattern {

    public static void printPattern(){
     /*
        for(char i = 65;i<=69;i++){
            for (char j=65;j<=69;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        } */
        for(char i = 'A';i<='E';i++){
            for (char j='A';j<='E';j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    public static void main(String [] args){

        printPattern();


    }
}
