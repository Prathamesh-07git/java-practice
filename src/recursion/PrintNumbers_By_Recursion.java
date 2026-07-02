package recursion;

public class PrintNumbers_By_Recursion {

    public static  void printNumber(int current , int n){

        if(current>n){
            return;
        }

        printNumber(current+1,n);
        System.out.println(current);
    }
    public static void main(String [] args){

        printNumber(1,5);
    }
}
