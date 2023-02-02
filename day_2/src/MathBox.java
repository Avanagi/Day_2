import java.util.*;

public class MathBox {

    private ArrayList<Integer> listOfInteger = new ArrayList<Integer> ();

    MathBox(Vector vector){
        listOfInteger = new ArrayList<Integer> ();
        QuickSortUtility.quickSort (vector, 0, vector.getSize () - 1);
        for (int i = 0; i < vector.getSize (); i++) {
            listOfInteger.add (vector.getElem (i));
        }
    }

    public ArrayList<Integer> output(){
        return listOfInteger;
    }

    public int summator(){
        int sum = 0;
        for (int integer: listOfInteger
             ) {
            sum += integer;
        }
        return sum;
    }

    public ArrayList<Integer> splitter(int del){
        ArrayList<Integer> locallistOfInteger = new ArrayList<Integer> ();
        for (int i = 0; i < listOfInteger.size (); i++) {
            locallistOfInteger.add (listOfInteger.get (i) / del);
        }
        return locallistOfInteger;
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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MathBox math = (MathBox) o;
        if (listOfInteger.size () != math.listOfInteger.size ()){
            return false;
        }
        boolean flag = true;
        for (int i = 0; i < listOfInteger.size (); i++) {
            if (listOfInteger.get (i) != math.listOfInteger.get (i)){
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

    public void remove(int elem){
        for (int i = 0; i < listOfInteger.size (); i++) {
            if (listOfInteger.get (i) == elem){
                listOfInteger.remove (i);
        }
        }
    }

}
