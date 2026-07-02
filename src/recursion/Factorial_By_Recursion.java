package recursion;

public class Factorial_By_Recursion {
    public static int factorial(int n){

        if(n==1){
            return 1;
        }
        else {
            //5x 4!
            return n * factorial(n-1);
        }
    }
    public static void main(String [] args){

        System.out.println(factorial(5));
    }
}
