package Methods;
import java.util.Scanner;
public class Ternary_Operator {
//condition ? expression1 : expression2;

    //method for check if the student is pass or fail
    public static String checkPassOrFail( int marks){

        String result = (marks >=50)?"The Student is pass the exam":"The Student failed in the exam ";
        return result;
    }
    public static void main (String [] args){
Scanner sc = new Scanner(System.in);

// write a java program for  Pass or Fail

        System.out.println("Enter your marks :- ");
        int marks = sc.nextInt();


        String result =checkPassOrFail(marks);

        System.out.println(result);
    }
}
