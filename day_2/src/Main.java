import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
        Integer[] vector = {1, 22, 10, 4, 5};
        Arrays.sort (vector);
        MathBox<Integer> mathbox = new MathBox<> (vector);
        mathbox.deleteObject (3);
        mathbox.dump ();
    }
}