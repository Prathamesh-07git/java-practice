package Methods;
/*
Q1. Write a method sum(int... nums) that returns sum of all numbers passed
* */

public class Variable_Arguments_Var_args {
     //its denoted array
    public static int sum(int... nums){
        int sum= 0;
        for(int i = 0;i< nums.length;i++){
            sum +=nums[i];
        }
        return sum;

    }
    public static void main(String [] args){


        int sumOfArray = sum(1,2,3,4,5);
        System.out.println(" the sum of all element in an array  "+sumOfArray);
    }

}
