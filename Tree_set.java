import java.util.Scanner;
import java.util.TreeSet;

public class Tree_set {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();

        System.out.println("Enter 6 numbers:");

        for (int i = 0; i < 6; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(set);
        set.add(2);
        System.out.println(set);
        System.out.println("Size: " + set.size());
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
    }
}

