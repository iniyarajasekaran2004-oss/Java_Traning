import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        Data d = new Data();
        d.addData();
        d.getData();
        Iterator<Object> i = d.a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

class Data {
    LinkedList<Object> a = new LinkedList<>();

    void getData() {
        System.out.println(a.getFirst());
        System.out.println(a.get(1));
        System.out.println(a.lastIndexOf(123));
    }

    void addData() {
        a.addFirst("iniya");
        a.add(1, 123);
        a.addFirst("hems");

    }

}
