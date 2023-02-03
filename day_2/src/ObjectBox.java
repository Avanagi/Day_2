import java.util.*;

/**
 * Описание класса ObjectBox
 */
public class ObjectBox {

    ArrayList<Object> Object = new ArrayList<Object> ();

    /**
     * Метод, добавляющий элемент в коллекцию
     * @param object параметр, который добавится в коллекцию
     */
    public void addObject(Object object){
        Object.add (object);
    }

    /**
     * Метод, удаляющий элемент из коллекции
     * @param object параметр, который удалится из коллекции
     */
    public void deleteObject(Object object){
        Object.remove (object);
    }

    /**
     * Вывод коллекции
     */
    public void dump(){
        System.out.println (Object.toString ());
    }
}
