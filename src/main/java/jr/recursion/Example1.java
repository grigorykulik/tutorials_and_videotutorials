package jr.recursion;

public class Example1 {
    public static void main(String[] args) {
        countdown(10);
    }

    public static void countdown(int x) {
        if (x <= 0) {
            System.out.println("Boom!");
        } else {
            System.out.println(x);
            countdown(x - 1);
        }
    }
}
