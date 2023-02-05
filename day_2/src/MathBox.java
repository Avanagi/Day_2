import java.util.*;

/**
 * Инициализация коллекции
 *
 * @param <T> Параметр, определяющий тип коллекции
 */
public class MathBox<T extends Number> extends ObjectBox {

    /**
     * Конструктор по значению
     *
     * @param vector вектор, элементы которого передаются в коллекцию
     */
    MathBox(T[] vector) {
        super.storage = new TreeSet<>();
        Collections.addAll(super.storage, vector);
    }

    /**
     * @return возвращает сумму элементов коллекции
     */
    public double summator() {
        double sum = 0;
        for(Object t: super.storage
        ) {
            sum += Double.parseDouble(t.toString());
        }
        return sum;
    }

    /**
     * @param div параметр, на который делятся элементы коллекции
     * @return возвращает измененную коллекцию
     */
    Collection<Double> splitter(T div) {
        List<Double> splitList = new ArrayList<>();
        for (Object x : this.storage) {
            try {
                splitList.add(Double.parseDouble(x.toString()) / div.doubleValue());
            }catch (NullPointerException e){
                throw new NullPointerException(e.getMessage());
            }
        }
        return splitList;
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
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        MathBox math = (MathBox) o;
        if(super.storage.size() != math.storage.size()) {
            return false;
        }
        return super.storage.equals(math.storage);
    }

    /**
     * @return вовращает Хэш-код коллекции
     */
    @Override
    public int hashCode() {
        return super.storage.hashCode();
    }

    /**
     * Переопределяем метод
     * @param elem параметр, который добавится в коллекцию
     * @return возавращаем результат вызова родительской функции
     */
    @Override
    boolean addObject(Object elem) {
        if(!(elem instanceof Number)) throw new IllegalArgumentException("Element is not Number");
        return super.addObject(elem);
    }

    /**
     * Переопределяем метод
     * @param elem параметр, который удалится из коллекции
     * @return возавращаем результат вызова родительской функции
     */
    @Override
    boolean deleteObject(Object elem) {
        if(!(elem instanceof Number)) throw new IllegalArgumentException("Element is not Number");
        return super.deleteObject(elem);
    }

}
