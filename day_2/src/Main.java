import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Integer[] vector = {1, 2, 4};
        MathBox<Integer> mathbox = new MathBox<>(vector);
        Integer[] vector2 = {1, 2, 4};
        MathBox<Integer> mathbox2 = new MathBox<>(vector);
        System.out.println(mathbox.equals(mathbox));
        System.out.println(mathbox.uuid);
        System.out.println(mathbox2.uuid);
        mathbox.dump();
    }
}