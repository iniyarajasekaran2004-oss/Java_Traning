
import java.util.ArrayList;
import java.util.List;

class sample {
    List<Integer> num = new ArrayList<>();

    sample() {
        num.add(7);
        num.add(8);
    }

    void checkcontains(int x) {
        System.out.println("num.contains(" + x + ")- " + num.contains(x));
        System.out.println("num.contains(7)- " + num.contains(7));
    }
}

public class Arraylist {
    public static void main(String[] args) {
        sample s = new sample();
        System.out.println("--------------Methods-----------------");
        s.num.add(1);
        s.num.add(2);
        s.num.add(3);
        s.num.add(4);
        s.num.add(6, 5);
        s.num.add(7, 6);
        System.out.println("List:" + s.num);
        System.out.println("num.get(0)- " + s.num.get(0));
        System.out.println("num.get(5)- " + s.num.get(5));
        System.out.println("num.contains(7)- " + s.num.contains(7));
        System.out.println("num.contains(2)- " + s.num.contains(2));
        s.checkcontains(8);
        System.out.println("indexOf(7)- " + s.num.indexOf(7));
        System.out.println("isEmpty()- " + s.num.isEmpty());
        System.out.println("equals(null)- " + s.num.equals(null));
        System.out.println("size- " + s.num.size());
        System.out.println(s.num.toString());
        s.num.sort(null);
        System.out.println(s.num);
        s.num.clear();
        System.out.println(s.num);
    }

}
