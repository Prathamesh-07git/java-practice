package strings;
import java.util.Scanner;
public class Strings_In_Java {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);


      //By String literal
       String name = "Prathamesh";

        System.out.println(name);

        System.out.print("Enter your full name :- ");
        String fullName = sc.nextLine();

        System.out.println(fullName);


        for(int i = 0;i<name.length();i++){
            System.out.printc(name.charAt(i)+"@");
        }




    }
}
