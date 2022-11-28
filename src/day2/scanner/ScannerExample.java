package day2.scanner;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int userAge = sc.nextInt();
        System.out.println("Your age is " + userAge);

        System.out.println("Enter a decimal point number: ");
        double userDouble = sc.nextDouble();
        System.out.println("userDouble = " + userDouble);

        sc.nextLine();

        System.out.println("Enter your name: ");
        String username = sc.nextLine();
        System.out.println("username = " + username);

        sc.close();

    }
}
