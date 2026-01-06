import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linkedhashset {
    public static void main(String[] args) {
        InputData data = new InputData();

        data.addData();
        data.addExtra(2);
        data.display();
        System.out.println("Size: " + data.checksize());
        System.out.println("contains 2- " + data.checkContain(2));
        data.cleardata();
        data.display();
    }
}

class InputData {
    private LinkedHashSet<Integer> set = new LinkedHashSet<>();
    private Scanner sc = new Scanner(System.in);

    void addData() {
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 6; i++) {
            set.add(sc.nextInt());
        }
    }

    void addExtra(int x) {
        set.add(x);
    }

    void display() {
        System.out.println("LinkedHashSet: " + set);
    }

    int checksize() {
        return set.size();
    }

    boolean checkContain(int x) {
        return set.contains(x);
    }

    void cleardata() {
        set.clear();
    }
}
