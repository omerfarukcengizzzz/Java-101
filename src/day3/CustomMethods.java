package day3;

import java.util.Scanner;

public class CustomMethods {

    public static void main(String[] args) {

        System.out.println(hello());
        System.out.println(num(87));

        System.out.println(checkIfEquals("Omer", "Dilovar"));

        if (checkIfEquals("Omer", "Omer")) {
            System.out.println("They are same");
        }

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        hi(name);

        sc.close();

        String username = "dilovar@gmail.com";
        hi(username);

    }

    public static void printHello() {
        System.out.println("Hello!");
    }

    public static void printXTimes(int xTimes) {

        for (int i = 1; i <= xTimes; i++) {
            System.out.println("Hello!");
        }

    }


    public static String hello() {
        return "Hello";
    }

    public static int num(int x) {
        return x;
    }


    public static boolean checkIfEquals(String a, String b) {
        return a.equals(b);
    }

    public static void hi(String name) {
        System.out.println("Hi " + name);
    }


}
