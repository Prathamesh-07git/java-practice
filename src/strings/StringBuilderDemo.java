package strings;
//StringBuilder is a mutable sequence of characters.
import java.util.*;
public class StringBuilderDemo {

    public static void main(String [] args){

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        System.out.println(sb);

        System.out.println(sb.reverse());



    }

}
