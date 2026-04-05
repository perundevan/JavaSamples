import java.util.HashSet;
import java.util.Set;

public class SetSample {
    static void main() {
        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("A");

        System.out.println(s.contains("A"));
        System.out.println(s.spliterator());
        System.out.println(s);


    }
}
