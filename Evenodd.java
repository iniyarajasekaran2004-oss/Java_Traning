import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args){
        System.out.print("Enter num : ");
        Scanner num= new Scanner(System.in);
        int Num= num.nextInt();

        if (Num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

}

