package strings;

public class String_Methods {

    public static void main(String[] args){

        // string declaration
        String s = "hello";

        //1️⃣ length()
        //👉 Returns number of characters
        System.out.println(s.length());

        //2️⃣ charAt(i)
        //👉 Get character at index
        System.out.println(s.charAt(3));
        // if you want to print the characters is string
        for(int i = 0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();

        //3️⃣ indexOf()
        //👉 Find position of character/word
        System.out.println(s.indexOf("l"));
        // there is 2 L in hello so which one it will give the l which occure 1st
        // 👉 indexOf() always gives first occurrence
        // if you want 2nd l
        // write like this
        System.out.println(s.indexOf("l",3));

        //🔥 Bonus
        //If character not found:
        //s.indexOf("z");  // -1

        //4️⃣ substring()
        //👉 Extract part of string
        System.out.println(s.substring(0,5));

        //🔥 Correct Rule
        //👉 substring(start, end)
        //Start → included ✅
        //End → excluded ❌
        //👉 So actual characters go from:
        //start  →  end - 1

        //5️⃣ toLowerCase() / toUpperCase()
        System.out.println(s.toLowerCase()); // convert the string in lowercase
        System.out.println(s.toUpperCase()); //  convert the string in the uppercase

        //6️⃣ trim()
        //👉 Remove spaces from start & end not from middle
        String name = " Prathamesh    ";
        System.out.println(name);  // space added
        System.out.println(name.trim()); // space remove
        /*
        ⚠️ Important (Immutable Concept 🔥)
        String s = "   Hello   ";
        s.trim();
        System.out.println(s);  // still has spaces ❌

        👉 Because:
           trim() returns new string
           Original not changed


           🔥 Key Points
              ✔ Removes only start & end spaces
              ✔ Returns new string
              ✔ Must assign back
        * */

        //7️⃣ replace()
        //👉 Replace characters/words
        String a = "good";
        // in this we replace the g with f which make good -> food
        System.out.println(a.replace("g","f"));

        //8️⃣ split()
        //👉 Convert string → array
        //👉 Used to break a string into parts (array)
//        String str = "a,b,c";
//        String arr[] = str.split(",");

        String Sentance = "hi my name is Prathamesh";
        //its return array so we need to assign it in array
        // in this sentence i need to remove the space so for that use \\s
        String [] ary = Sentance.split("\\s");
        for (String c :ary){
            System.out.println(c);
        }

        //9️⃣ contains()
        // 👉 Check substring exists
        String present = "my name is Prathamesh";
        System.out.println(present.contains("my"));//check that my is present in string or not
        System.out.println(present.contains("my name")); // true
        System.out.println(present.contains("my name Prathamesh")); // whay its is false
        /*
        Why last one is false?
        👉 contains() checks for exact continuous substring

        🎯 Rule
        👉 contains() needs:
           exact match
           same order
           continuous (no missing words)
        * */



        //🔟 startsWith() / endsWith()

        String url = "https://claude.ai";
        System.out.println(url.startsWith("https")); //ture it check that the string really start with https
        System.out.println(url.endsWith("ai")); //true if check that the url ends with ai

        // 1️⃣1️⃣ toCharArray()
        //👉 Convert string → char array
        /*
        🧠 What happens internally
        "Hello"
           ↓
        [H, e, l, l, o]
        👉 Each character stored separately in array
        * */
        String character = "Hello";
        char arr[] = character.toCharArray();
        for(int i=0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //1️⃣2️⃣ valueOf()
        //👉 Convert other types → String
        // int this it convert the int in string
        int n1 = 45;
        double  n2 =45.6;

        System.out.println(String.valueOf(n1));
        System.out.println(String.valueOf(n2));


        //1️⃣4️⃣ join()
        //👉 Join multiple strings

        String result = String.join(", ", "a", "b", "c");
        System.out.println(result);  // a, b, c

        String.join("-", "a", "b", "c");  // a-b-c


        //1️⃣5️⃣ isEmpty() / isBlank()
//        System.out.println("".isEmpty());      // true
//        System.out.println("  ".isEmpty());    // false
//        System.out.println("  ".isBlank());    // true  (Java 11+)
//        System.out.println("hi".isBlank());   // false

    }
}
