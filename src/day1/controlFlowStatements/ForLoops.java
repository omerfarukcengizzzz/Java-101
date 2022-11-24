package day1.controlFlowStatements;

public class ForLoops {
    public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {

            if (i == 3) {
                continue;
            }

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("========================");

//        Write a program that displays all even numbers between 1-100 in same line

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        System.out.println("========================");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
        }

    }
}
