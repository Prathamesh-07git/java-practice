package Methods;
//Q2. Write recursive method fibonacci(int n) that returns nth fibonacci number

// 0 1 1 2 3 5 8 ............
import java.util.Scanner;
public class Fibonacci_Series {
    public static void printFibonacci(int n){
        int prev = 0;
        int current = 1;
        int next;
        System.out.println(prev);
        System.out.println(current);
        for(int i = 0;i<n;i++){

            next = prev + current;

            prev = current;
            current = next;
            System.out.println(next);
        }

    }
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :- ");
        int nth = sc.nextInt();


     printFibonacci(nth);

    }
}
