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
        int [] vector = new int[size];
        input(vector);

        MathBox mathbox = new MathBox (vector);
        System.out.println (mathbox.output ());

        ObjectBox objectBox = new ObjectBox ();
        objectBox.addObject (2);
        objectBox.addObject ("gfd");
        objectBox.deleteObject ("gfd");
        objectBox.dump ();
    }

    public static void input(int[] vector){
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter Your Array");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt ();
        }
        if (!checkRepeats (vector)){
            System.out.println ("Found Repeats In Vector, Try Again: ");
            input (vector);
        }
    }

    public static boolean checkRepeats(int[] vector) {
        boolean flag = true;

        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }
}