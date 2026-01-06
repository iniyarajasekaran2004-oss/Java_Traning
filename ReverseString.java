public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World! This is Iniya Rajasekaran";
        int i = str.length() - 1;

        while (i >= 0) {
            System.out.print(str.charAt(i));
            i--;
        }
    }
}


