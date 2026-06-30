package Methods;
//Definition
//
//Method Overloading means:

//Creating multiple methods with the same name but different parameter lists in the same class.

public class Method_Overloading {
/*
 public static void print(int x){
     System.out.println(x);
 }

 public static void print(double x){
     System.out.println(x);
 }
 public static void print(String x){
     System.out.println(x);
 }
*/
    public static void main(String [] args){

   /*  print(5);
     print(5.0);
     print("Prathamesh");
    */


        System.out.println(add(5,10));
        System.out.println(add(5,10,15));
    }

    public static int add(int a , int b){
        return a+b;
    }

    public static int add(int a,int b, int c){
        return a + b + c;
    }



}
