package strings;

public class StringImmutableDemo {

    public static void main(String[] args) {
        String s = "Java";

        System.out.println("Before: " + s);

        s.concat(" Programming");

        System.out.println("After concat(): " + s);

        s = s.concat(" Programming");

        System.out.println("After reassignment: " + s);
    }
}
