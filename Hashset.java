import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
    public static void main(String[] args) {
        input call=new input();
        HashSet<Integer> set=call.getdata();
        System.out.println(set);
        set.add(2);
        System.out.println(set);
        System.out.println("Size- "+set.size());


    }
}
class input{
    HashSet<Integer> getdata(){
        System.out.println("Enter the number to add");
        Scanner get=new Scanner(System.in);
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0;i<6;i++){
            hash.add(get.nextInt());
        }
        return hash;
    }

}