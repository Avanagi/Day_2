import java.util.*;
public class ObjectBox {

    private ArrayList<Object> Object = new ArrayList<Object> ();

    public void addObject(Object object){
        Object.add (object);
    }

    public void deleteObject(Object object){
        Object.remove (object);
    }

    public void dump(){
        System.out.println (Object.toString ());
    }
}
