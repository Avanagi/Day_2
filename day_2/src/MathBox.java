import java.util.*;

public class MathBox<T> {

    private ArrayList<T> listOfInteger = new ArrayList<T> ();

    MathBox(T[] vector) {
        listOfInteger = new ArrayList<T> ();
        //QuickSortUtility.quickSort (vector, 0, vector.length - 1);
        listOfInteger.addAll (Arrays.asList (vector));
        if (! checkRepeats (vector)) {
            System.out.println ("Found Repeats In Vector, Program Has Been Determinated ");
            System.exit (0);
        }
        listOfInteger.sort (new Comparator<T> () {
            public int compare(T o1, T o2) {
                return o1.toString ().compareTo (o2.toString ());
            }
        });
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

    public ArrayList<T> output() {
        return listOfInteger;
    }

    public double summator() {
        double sum = 0;
        for (T t : listOfInteger
        ) {
            String s1 = t.toString (); double s2 = Double.parseDouble (s1);
            sum += s2;
        }
        return sum;
    }

    public ArrayList<Double> splitter(T del) {
        ArrayList<Double> localhostOfInteger = new ArrayList<Double> ();
        for (T t : listOfInteger) {
            String s1 = del.toString (); double s2 = Double.parseDouble (s1);
            String s3 = t.toString (); double s4 = Double.parseDouble (s3);
            localhostOfInteger.add (s4 / s2);
        }
        return localhostOfInteger;
    }

    @Override
    public String toString() {
        return "MathBox [listOfInteger = " + listOfInteger + "]";
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
        if (listOfInteger.size () != math.listOfInteger.size ()) {
            return false;
        }
        boolean flag = true;
        for (int i = 0; i < listOfInteger.size (); i++) {
            if (listOfInteger.get (i) != math.listOfInteger.get (i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return listOfInteger.hashCode ();
    }

    public void remove(T elem) {
        for (int i = 0; i < listOfInteger.size (); i++) {
            if (listOfInteger.get (i) == elem) {
                listOfInteger.remove (i);
            }
        }
    }
}
