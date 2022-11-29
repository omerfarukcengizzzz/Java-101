package day3.tasks;

public class Task_60 {

    public static void main(String[] args) {

        System.out.println(calculator(6, 3, "+"));
        System.out.println(calculator(6, 3, "-"));
        System.out.println(calculator(6, 3, "*"));
        System.out.println(calculator(6, 3, "/"));

    }

    /*
    *   Write a method that accepts 3 parameters:
        1- number
        2- number
        3- operator(-,+,*,/)
        *
        Sample output:
        calculator(6,3, “+”) -- > 9
        calculator(6,3, “-”) -- > 3
        calculator(6,3, “*”) -- > 18
        calculator(6,3, “/”) -- > 2
    * */

    public static int calculator(int num1, int num2, String operator) {

        if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("*")) {
            return num1 * num2;
        } else if (operator.equals("/")) {
            return num1 / num2;
        } return 0;

    }

}
