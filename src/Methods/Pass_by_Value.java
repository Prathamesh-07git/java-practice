package Methods;

public class Pass_by_Value {
    /* What is Pass-by-Value?
    Definition:
    A copy of the variable's value is passed to the method.
    If you change the parameter inside the method, the original variable does not change.

    What is Pass-by-Reference?
Definition:
The original variable itself is passed to the method.
If the method changes it, the original variable also changes.
 */
    static void change(int x){
            x=100;
    }
    public static void main(String [] args){
        int a = 10;

        change(a);

        System.out.println(a);

    }
}
/*
Q: Does Java support Pass-by-Reference?

Answer:
❌ No.
Java supports only Pass-by-Value.
For primitive types (int, double, char, etc.), Java copies the actual value.
For arrays and objects, Java copies the reference value (the value that points to the object), not the object itself.
That's why you can modify the contents of an object or array, but you cannot make the caller's variable point to a different object by reassigning the parameter.
* */