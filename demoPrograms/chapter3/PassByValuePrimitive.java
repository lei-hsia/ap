package ap.chapter3;

/**
 * @author lei
 * @date 11/07/2021 11:02 AM
 */
public class PassByValuePrimitive {
    public static void foo(int x, double y) {
        x = 3;
        y = 2.5;
    }

    public static void main(String[] args) {
        int a = 7;
        double b = 6.5;
        foo(a, b);
        System.out.println(a + " " + b);
    }
}
