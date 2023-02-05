import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
        Integer[] vector = {1, 2, 4};
        MathBox<Integer> mathbox = new MathBox<> (vector);
        System.out.println (mathbox.splitter (2));
        System.out.println (mathbox.summator ());
        mathbox.dump ();
    }
}