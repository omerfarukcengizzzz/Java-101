package day1.controlFlowStatements;

public class IfStatements {

    public static void main(String[] args) {

//        1- Write an if statement that assigns 5 to x when y is equal to 20

        int x = 0;
        int y = 21;

        if (true) {
            x = 5;
        }

        System.out.println("x = " + x);
        System.out.println("===========================");

//        2- Write an if statement that multiplies payrate by 1.5 if hours is greater than 40

        double payrate = 1.5;
        int workHours = 30;
        int hourlyRate = 10;
        double salary = 0;

        if (workHours > 40) {
            salary = (40 * hourlyRate) + ((workHours - 40) * (hourlyRate * 1.5));
        } else {
            salary = (workHours * hourlyRate);
        }

        System.out.println("salary = " + salary);
        System.out.println("===========================");


        int a = 1;

        if (a == 0) {
            System.out.println("a = 0");
        } else if (a == 1) {
            System.out.println("a = 1");
        } else if (a == 2) {
            System.out.println("a = 2");
        } else {
            System.out.println("a = " + a);
        }
        System.out.println("===========================");

        // NESTED IF STATEMENTS

        String name = "Omer";
        int age = 25;

        if (name.equals("Omer")) {

            System.out.println("name is " + name);

            if (age == 25) {
                System.out.println("age is " + age);
            }

        }

        System.out.println("===========================");




    }

}
