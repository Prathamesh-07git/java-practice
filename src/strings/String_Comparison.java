package strings;

import javax.xml.transform.Source;

public class String_Comparison {
    public static void main(String [] args){
/*
Now you need to check if both are the same.
Java provides two ways:
==
.equals()
These do different things.
* */
//  == checks whether two references point to the same object in memory.
//It does not compare the actual characters.
        String username = "Prathamesh";
        String input = "Prathamesh";

        System.out.println(username==input);
        //.equals() compares the contents (characters) of two strings.
        String a = "hi";
        String b = "hello";
        System.out.println(a.equals(b));
    }
}
