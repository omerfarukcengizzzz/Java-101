package day3.tasks;

import java.util.Scanner;

public class Task_57 {
    public static void main(String[] args) {
       // sumOf3Numbers(3, 4, 5);
        sumOf3();
    }


//    Write a method that calculates the sum of 3 numbers

    public static void sumOf3Numbers(int a, int b, int c) {

        int result = a + b + c;
        System.out.println("result = " + result);

    }

    public static void sumOf3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        int result = a + b + c;
        System.out.println("result = " + result);

        sc.close();
    }

}
