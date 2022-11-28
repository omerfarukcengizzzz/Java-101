package day2.questions;

public class Q1 {
    public static void main(String[] args) {

//        Write a program that displays sum of even and odd numbers between 1 and 100
//        excluding 100

        int sumOfEven = 0, sumOfOdd = 0;

        for (int i = 1; i < 100; i += 2) {
            sumOfOdd = sumOfOdd + i;

            if (i == 99) {
                break;
            }

            sumOfEven += i+1;
        }

//        for (int i = 2; i < 100; i += 2) {
//            sumOfEven += i;
//        }

        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);

    }
}
