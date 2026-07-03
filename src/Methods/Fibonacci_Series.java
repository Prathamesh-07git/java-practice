package Methods;
//Q2. Write  method fibonacci(int n) that returns nth fibonacci number by using loops

// 0 1 1 2 3 5 8 ............
import java.sql.SQLOutput;
import java.util.Scanner;
public class Fibonacci_Series {
    public static void printFibonacci(int n){
        int prev = 0;
        int current = 1;
        int next;

        if (n<=0){
            System.out.println("Invalid input ! please Enter the number Greater than 0 ");
            return;
        }

        else if(n==1){
            System.out.print(prev);
            return;
        }
        else {
            System.out.print(" "+prev);
            System.out.print(" "+current);
        }

        for(int i = 0;i<n-2;i++){

            next = prev + current;

            prev = current;
            current = next;
            System.out.print(" "+next);
        }

    }
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int nth = sc.nextInt();


     printFibonacci(nth);

    }
}
