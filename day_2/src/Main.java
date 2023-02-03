import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner (System.in);

            MathBox<Integer> mathbox = new MathBox<> (new Integer []{1, 2, 3, 4, 5});
            MathBox<Integer> mathbox1 = new MathBox<> (new Integer []{1, 2, 3, 4, 5});
            System.out.println (mathbox.equals (mathbox1));
            System.out.println (mathbox1.hashCode ());
            System.out.println (mathbox.summator ());

            Set ms = new HashSet ();
            ms.add (mathbox);
            System.out.println (ms.hashCode ());

            ObjectBox objectBox = new ObjectBox ();
            objectBox.addObject (2);
            objectBox.addObject ("gfd");
            objectBox.deleteObject ("gfd");
            objectBox.dump ();
        }
        catch (Throwable e){
            System.err.println (e);
        }
    }
}