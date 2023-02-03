import java.util.*;

public class MathBox<T> extends ObjectBox{

    MathBox(T[] vector) {

        super.Object.addAll (Arrays.asList (vector));
        if (! checkRepeats (vector)) {
            System.out.println ("Found Repeats In Vector, Program Has Been Determinated ");
            System.exit (0);
        }

    }

    public boolean checkRepeats(Object[] vector) {
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

    public double summator() {
        double sum = 0;
        for (java.lang.Object t : super.Object
        ) {
            String s1 = t.toString (); double s2 = Double.parseDouble (s1);
            sum += s2;
        }
        return sum;
    }

    public ArrayList<Double> splitter(T del) {
        ArrayList<Double> localhostOfInteger = new ArrayList<Double> ();
        for (java.lang.Object t : super.Object) {
            String s1 = del.toString (); double s2 = Double.parseDouble (s1);
            String s3 = t.toString (); double s4 = Double.parseDouble (s3);
            localhostOfInteger.add (s4 / s2);
        }
        return localhostOfInteger;
    }

    @Override
    public String toString() {
        return "MathBox [listOfInteger = " + super.Object + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass () != o.getClass ()) {
            return false;
        }
        MathBox math = (MathBox) o;
        if (super.Object.size () != math.Object.size ()) {
            return false;
        }
        boolean flag = true;
        for (int i = 0; i < super.Object.size (); i++) {
            if (super.Object.get (i) != math.Object.get (i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return super.Object.hashCode ();
    }

    @Override
    public void addObject(Object object){
        if (object instanceof Integer || object instanceof Float){
            super.Object.add (object);
        } else {
            System.out.println ("Unavailable To Add This Object " + object);
        }
    }

    @Override
    public void deleteObject(Object object){
        boolean flag = false;
        for (Object i: Object
             ) {
                if (object == i){
                    super.Object.remove (object);
                    flag = true;
                }
        }
        if (!flag){
            System.out.println ("Object " + object + " Is Not In List");
        }
    }
}
