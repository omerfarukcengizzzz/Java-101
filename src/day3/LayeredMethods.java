package day3;

public class LayeredMethods {

    public static void main(String[] args) {

        methodA();

    }


    public static void methodA() {
        System.out.println("methodA");
        methodB();
    }

    public static void methodB() {
        System.out.println("methodB");
        methodC();
        System.out.println("b");
    }

    public static void methodC() {
        System.out.println("methodC");
    }


}
