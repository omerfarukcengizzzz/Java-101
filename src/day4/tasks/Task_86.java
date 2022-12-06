package day4.tasks;

import java.util.Scanner;

public class Task_86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month number to see which one it is: ");
        int num = sc.nextInt();

        System.out.println("Month name is " + months(num));

    }


    public static String months(int i) {

        if (i <= 0 || i >= 13) {

            System.out.println("invalid number, range should be between 1-12");
            return null;

        } else {
            String monthsList[] = {
                    "January",
                    "February",
                    "March",
                    "April",
                    "May",
                    "June",
                    "July",
                    "August",
                    "September",
                    "October",
                    "November",
                    "December"
            };

            return monthsList[i - 1];
        }

    }
}
