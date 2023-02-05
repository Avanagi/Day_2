import java.util.*;

/**
 * Описание класса ObjectBox
 */
public class ObjectBox{

    Collection<Object> storage;

    public Collection<Object> getStorage(){
        return storage;
    }

    /**
     * Метод, добавляющий элемент в коллекцию
     * @param elem параметр, который добавится в коллекцию
     */
    boolean addObject(Object elem){
        if (elem instanceof Integer || elem instanceof Float){
            return this.getStorage().add (elem);
        } else {
            return false;
        }
    }

    /**
     * Метод, удаляющий элемент из коллекции
     * @param elem параметр, который удалится из коллекции
     */
    boolean deleteObject(Object elem){
        boolean flag = false;
        for (Object i: storage
        ) {
            if (elem == i){
                flag = true;
                return this.getStorage ().remove (elem);
            }
        }
        return false;
    }

    /**
     * Вывод коллекции
     */
    public void dump(){
        String data = "Storage: ";
        StringBuilder sb = new StringBuilder (data);
        for (Object i:
             storage) {
            sb.append (i + " ");
        }
        System.out.println (sb);
    }
}
