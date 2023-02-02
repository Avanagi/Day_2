import java.util.Scanner;

public class Vector {
    Scanner scanner = new Scanner (System.in);
    private final int size;
    private final int[] elem;

    Vector(int size) {
        this.size = size;
        elem = new int[size];
    }

    public int getSize() {
        return size;
    }

    public int getElem(int i) {
        return elem[i];
    }

    public void setElem(int i, int elem) {
        this.elem[i] = elem;
    }

    public void input() {
        System.out.println ("Enter Your Array");
        for (int i = 0; i < size; i++) {
            elem[i] = scanner.nextInt ();
        }
        if (!checkRepeats ()){
            System.out.println ("Found Repeats In Vector, Try Again: ");
            input ();
        }
    }

    public void output() {
        System.out.println ("Your Array Is: ");
        for (int i = 0; i < size; i++) {
            System.out.print (elem[i] + " ");
        }
        System.out.println ();
    }

    public boolean checkRepeats() {
        boolean flag = true;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (elem[i] == elem[j]) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }
}