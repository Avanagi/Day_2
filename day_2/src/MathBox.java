import java.util.*;

/**
 * Инициализация коллекции
 * @param <T> Параметр, определяющий тип коллекции
 */
public class MathBox<T extends Number> extends ObjectBox{

    /**
     * Конструктор по значению
     * @param vector вектор, элементы которого передаются в коллекцию
     */
    MathBox(T[] vector) {
        super.storage = new TreeSet<> ();
        Collections.addAll (super.storage, vector);
    }

    /**
     * @return возвращает сумму элементов коллекции
     */
    public double summator() {
        double sum = 0;
        for (Object t : super.storage
        ) {
            String s1 = t.toString ();
            double s2 = Double.parseDouble (s1);
            sum += s2;
        }
        return sum;
    }

    /**
     * @param div параметр, на который делятся элементы коллекции
     * @return возвращает измененную коллекцию
     */
    public ArrayList<Double> splitter(T div) {
        ArrayList<Double> localhostOfInteger = new ArrayList<Double> ();
        for (Object t : storage) {
            String s1 = div.toString ();
            double s2 = Double.parseDouble (s1);
            String s3 = t.toString ();
            double s4 = Double.parseDouble (s3);
            double s;
            try {
               s = s4 / s2;
            } catch (ArithmeticException e){
                System.out.println("division by zero");
            }
            localhostOfInteger.add (s4 / s2);
        }
        return localhostOfInteger;
    }

    /**
     * @return воврат значения коллекции
     */
    @Override
    public String toString() {
        return "MathBox [storage = " + super.storage + "]";
    }

    /**
     * @param o объект, с которым сравнивается класс
     * @return возвращает результат проверки
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass () != o.getClass ()) {
            return false;
        }
        MathBox math = (MathBox) o;
        if (super.storage.size () != math.storage.size ()) {
            return false;
        }
        return super.storage.equals (math.storage);
    }

    /**
     * @return вовращает Хэш-код коллекции
     */
    @Override
    public int hashCode() {
        return super.storage.hashCode ();
    }

}
