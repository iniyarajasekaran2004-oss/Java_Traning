class Parent {
    int c;
    Parent() {
        int a=10;
        int b=20;
        c=a+b;
    }
}
class Child extends Parent {
    Child() {
        this(true);
    }
    Child(boolean x) {
        super();
        System.out.println("Sum: " +c);
    }
    public static void main(String[] args) {
        Child obj = new Child();
    }
}


