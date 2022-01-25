package jr.weak_reference_example;

import java.lang.ref.WeakReference;

public class Example1 {
    public static void main(String[] args) {
        String s = new String();
        WeakReference<String> reference = new WeakReference<String>(s);
        s = null;
        s = reference.get();
        reference.clear();
    }
}
