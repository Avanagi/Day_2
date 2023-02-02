import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter Size Of Array: ");
        int size;
        size = scanner.nextInt ();
        Vector vector = new Vector (size);
        vector.input ();
        MathBox mathbox = new MathBox (vector);
        System.out.println (mathbox.output ());
        Set<MathBox> listOfInteger = new HashSet<> ();
        listOfInteger.add (mathbox);
        System.out.println (listOfInteger.hashCode ());
    }
}