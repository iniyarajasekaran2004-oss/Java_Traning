/*class CustomException extends Exception {

    static void Number(int num) throws Exception{
        if (num < 0) {
            throw new Exception("Number cannot be negative");
        } else {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            Number(-5);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}*/
class CustomException extends Exception {
    CustomException(String Message){
        super(Message);
    }

    static void checkString(String input) throws Exception {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {
                throw new Exception("Input is not a String");
            }
        }
        System.out.println("Input is a valid String");
    }

    public static void main(String[] args) {
        try {
            checkString("iniya123");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

