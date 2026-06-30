package Methods;
//Definition
//
//Method Overloading means:

//Creating multiple methods with the same name but different parameter lists in the same class.

public class Method_Overloading {

 public static void print(int x){
     System.out.println(x);
 }

 public static void print(double x){
     System.out.println(x);
 }
 public static void print(String x){
     System.out.println(x);
 }

    public static void main(String [] args){

     print(5);
     print(5.0);
     print("Prathamesh");
    }

}
