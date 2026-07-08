package strings;

import javax.xml.transform.Source;

public class String_Comparison {
    public static void main(String [] args){
// ==
// Compares the references (memory addresses) of two String objects.
// Returns true if both variables point to the same object in memory.


// .equals()
// Compares the actual contents (characters) of two Strings.
// Returns true if both Strings contain exactly the same text.


// .compareTo()
// Compares two Strings lexicographically (dictionary/alphabetical order).
// Returns:
// 0  -> Strings are equal
// < 0 -> Current String comes before the other String
// > 0 -> Current String comes after the other String

        String name = "Prathamesh";
        String name1="Prathamesh";

        System.out.println(name==name1);  // compare memory address
        System.out.println(name.equals(name1)); // compare actual content
        System.out.println(name.compareTo(name1));





    }
}
