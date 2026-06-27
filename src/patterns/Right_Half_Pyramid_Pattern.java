package patterns;
/*

*
* *
* * *
* * * *
* * * * *
* * * * * *

* */
public class Right_Half_Pyramid_Pattern {

    public static void printPattern(){

        for(int i = 0;i<6;i++){
            for(int j= 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String [] args){

printPattern();

    }
}
