import java.util.Scanner;

public class PrimeNumber {

        public static void main(String[] args){

            System.out.print("Enter the number:");
            Scanner num= new Scanner(System.in);
            int Num= num.nextInt();
            System.out.println("The prime no till "+Num+":" );
            for(int i=1;i<=Num;i++){
                int count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count=count+1;
                    }
                }
                if(count==2){
                    System.out.println(i);
                }

            }


        }

    }


