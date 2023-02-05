import java.util.*;

/**
 * Описание класса ObjectBox
 */
public class ObjectBox {

    Collection<Object> storage;
    UUID uuid;

    public Collection<Object> getStorage() {
        return storage;
    }

    /**
     * Метод, добавляющий элемент в коллекцию
     *
     * @param elem параметр, который добавится в коллекцию
     */
    boolean addObject(Object elem) {
        return this.getStorage().add(elem);
    }

    /**
     * Метод, удаляющий элемент из коллекции
     *
     * @param elem параметр, который удалится из коллекции
     */
    boolean deleteObject(Object elem) {
        return this.getStorage().remove(elem);
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
        if(uuid != math.uuid){
            return false;
        }
        if(storage.size() != math.storage.size()) {
            return false;
        }
        return storage.equals(math.storage);
    }

    /**
     * @return вовращает Хэш-код коллекции
     */
    @Override
    public int hashCode() {
        return storage.hashCode();
    }

    /**
     * Вывод коллекции
     */
    public void dump() {
        String data = "Storage: ";
        StringBuilder sb = new StringBuilder(data);
        for(Object i:
                storage) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}
